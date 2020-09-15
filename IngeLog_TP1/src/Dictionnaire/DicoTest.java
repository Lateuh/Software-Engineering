package Dictionnaire;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DicoTest {
    
    OrderedDictionary d;

    @Before
    public void setUp() throws Exception {
        String tabmot[] = {};
        String tabdef[] = {};
        
        d = new OrderedDictionary(tabmot,tabdef,0);
    }

    
    @Test
    public void testAddOneElementToEmptyDico(){
        d.put("Michel", "C'est le Brésil");
        assertEquals(1, d.size());
        assertTrue(d.containsKey("Michel"));
        assertEquals("C'est le Brésil", d.get("Michel"));
    }
    
    @Test
    public void test() {
        //fail("Not yet implemented");
    }

}

