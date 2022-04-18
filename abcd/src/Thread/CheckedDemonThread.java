package Thread;
class MyThread11 extends Thread{
	
}
public class CheckedDemonThread {
	public static void main(String[] args) {
		MyThread11 t=new MyThread11();
		System.out.println(Thread.currentThread().isDaemon()); 
		//Thread.currentThread().setDaemon(true);// IllegalThreadStateException
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println(t.isDaemon());
	}

}
