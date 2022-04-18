package array;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Hash {
public static void main(String[] args) {
	Map m= new HashMap();
	m.put(1, "sundri");
	m.put(2, "sundri");
	m.put(null, "sundri");
	m.put(null, "sundri");
	
	System.out.println(m);
	
	Map s= new TreeMap();
	s.put(1, "sundri");
	s.put(2, "sundri");
	s.put(2, "null");
	//s.put("hi", "sundri");
	System.out.println(s);
}
}
