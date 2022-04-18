package InnerClass;

public class NestedClass {
 static class Nested{
	 public void m1() {
		System.out.println("nested class method");
	}
	 
 }
 public static void main(String[] args) {
		Nested n=new Nested();   //no need to create object for outer class then create object for inner class 
		//as inner class is static we can directley create object for inner class
		n.m1();
	}
}
