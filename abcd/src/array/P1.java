package array;
//import java.util.ArrayList;
 public  class P1{
	    int i=10; 
		Integer b=i;
	public static void main(String[] args) {
		
	   // P1 ref1=new P1();
		Object obj=new P1().b;      // Anonymous Object Creation  //Object obj=new P1();...... Upcasting...............
		System.out.println(obj);
	}
}
 
 
 
 // line no 8
 //The address of P1 is stored in ref1 by using reference variable//
 //line no 9
 //We can also create new object without reference variable ie Anonymous object
 //Observe line nine we doing two things simultaneously doing Upcasting Object obj=new P1() to  access variable of anonymous object we use 
 // new P1().i 
 //Important step  because of newP1().i value of b is stored in obj ie  class Object reference variable(ie.obj)