package array;

import java.util.HashMap;


	public class Program5{
		 public static void main(String[] args) {
			HashMap hm=new HashMap();
			hm.put(new Employee ("a"),"emp1");
			hm.put(new Employee ("b"),"emp2");
			hm.put(new Employee("a"),"emp1 override");
			
			System.out.println(hm.size());
			System.out.println(hm);
			System.out.println(hm.get(new Employee("a")));
		}
	 }



