package array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.HashSet;
//import java.util.Set;

public class List1 {
public static void main(String[] args) {
	ArrayList a= new ArrayList();
	a.add(10);
	a.add("hii");
	a.add(null);
	a.add(40);
	a.add(-900);
	System.out.println("ArrayList INSERTION ORDER:"+a);
	
	LinkedList l= new LinkedList();
	l.add(10);
	l.add("hii");
	l.add(null);
	l.add(-900);
	l.add(40);
	l.add(10);
	l.add(null);
	System.out.println("LinkedList INSERTION ORDER:"+l);
	LinkedHashSet s= new LinkedHashSet(l);
	System.out.println("LinkedHashSet INSERTION ORDER WITH NO DUPLICATE OBJECTS:"+s);
	HashSet h= new HashSet(l);
	System.out.println("HashSet NO INSERTION ORDER:"+h);
	System.out.println("=====================================================");
	System.out.println(" CONVERT Set to Array ");
	Object [] a1=h.toArray();
	System.out.println(a1);
	for (Object obj:a1)
	{
		System.out.println(obj);
	}
	for (int i = 0; i < a1.length; i++) {
		System.out.println(a1[i]);
	}
}
}
