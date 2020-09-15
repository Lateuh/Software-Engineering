package Dictionnaire;
import java.util.*;

public interface IDictionary {
	public Object get(Object key);
	public IDictionary put(Object key, Object val);
	public boolean isEmpty();
	public boolean containsKey(Object key);
	public int size();
	
}
