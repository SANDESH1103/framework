package Thread;

 class Test extends Thread{
 }
 
 
 
 class Priority{
  public static void main(String[] args) {
	//main thread execution start
	System.out.println(Thread.currentThread().getPriority());
	Test p=new Test();   //Main thread is responsible for child class object creation.
	   p.start();         // Main thread is responsible for child thread creation.
	//Thread.currentThread().setPriority(7);
	 //Thread.currentThread().setPriority(15); //RE: Illegal argument Exception.
	System.out.println(Thread.currentThread().getPriority());// Child thread will get priority of parent thread(ie main thread main method thread) priority by default. 
}
}
