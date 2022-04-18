package array;
import java.util.ArrayList;
import java.util.Iterator;
public class List {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
//	a.add(5);
//	a.add(10);
//	a.add(35);
//	a.add(45);
//	a.add(10);
	for (int i = 0; i <=10; i++) {
		a.add(i);
	}
	
	System.out.println(a);
	Iterator i=a.iterator();
	//i.remove();
	System.out.println(i);
//	for (Iterator.i=0;i<a.size();i.hasNext());
//	{
//		System.out.println(i.next());
//	}
//	for(Object obj:a)
//	{
//		System.out.println(obj);
//	}
}


}
