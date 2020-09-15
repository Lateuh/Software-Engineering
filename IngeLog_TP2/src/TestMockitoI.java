
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.AdditionalMatchers.*;

import static org.mockito.Matchers.argThat;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatcher;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

//import dictionary.I;

@RunWith(MockitoJUnitRunner.class)
public class TestMockitoI {
	@Mock I mock;

	@Test
	public void testValeurParDefaut() throws Exception {
		assertEquals(0, mock.methodeInt());
	}

	@Test
	public void testValeursSuccessives()throws Exception {
		when(mock.methodeInt()).thenReturn(1,2,3,4,5);
		int result=0;
		for (int i=0;i<5;i++){result=mock.methodeInt(); assertEquals(i+1, result);} // 4 appels
		verify(mock, times(5)).methodeInt();
		for (int i=0;i<10;i++){result=mock.methodeInt(); assertEquals(5, result);} // le mocke se bloque ensuite sur la dernière valeur		
	}

	@Test(expected=Exception.class)
	public void testExceptionsMethodeNotVoid() throws Exception{
		when(mock.methodeInt()).thenThrow(new Exception());
		mock.methodeInt();
	}

	@Test(expected=Exception.class)
	public void testExceptionsMethodeVoid() throws Exception{
		doThrow(new Exception()).when(mock).methodeVoid(); 
		mock.methodeVoid();
	}

	@Test 
	public void testParams(){

		when(mock.methodeParam(3)).thenReturn(3); 
		when(mock.methodeParam(5)).thenReturn(10); 
		assertEquals(mock.methodeParam(1), 0);
		assertEquals(mock.methodeParam(3), 3);
		assertEquals(mock.methodeParam(5), 10);
	}
	@Test 
	public void testParamsMatchers(){

		when(mock.methodeParam(gt(10))).thenReturn(42); 
		when(mock.methodeParam(leq(10))).thenReturn(1); 
		assertEquals(mock.methodeParam(1), 1);
		assertEquals(mock.methodeParam(3), 1);
		assertEquals(mock.methodeParam(10), 1);
		assertEquals(mock.methodeParam(11), 42);
	}
}

