package array;
//import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class A1 {
	public static void main(String[] args) {
		List arrayList=new ArrayList();
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("z");
		arrayList.add("g");
		arrayList.add("f");
		System.out.println("before:"+arrayList);
		Collections.sort(arrayList);
		System.out.println("After:"+arrayList);
		Collections.reverse(arrayList);
		System.out.println("Desc:"+arrayList);
//		Iterator i=arrayList.iterator();
//		while (i.hasNext())
//		{ 
//			System.out.println(i.next());
//			arrayList.add("c");
//		}
//	}

//    Map m=new LinkedHashMap();
//      m.put(11,"audi");
//      m.put(null,null);
//      m.put(11,"bmw");
//      m.put(null,"fer");
//      
//      System.out.println(m.size());
//      System.out.println(m);
  }
}