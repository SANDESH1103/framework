package Thread;

class A10 extends Thread {
	public void run() {
		try {
			for (int i = 1; i < 10; i++) {
				System.out.println("I am lazy Thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("I got Interrupted");
		}
	}
}

public class InterruptMethod {
	public static void main(String[] args) {
		A10 t = new A10();
		t.start();
		t.interrupt();//-----(1)   If we comment line one then main thread wont interrupt child thread in these case child thread will excute for loop 10 times.
		                           // if we are not commenting line 1 then main thread interrupt child thread in these case output is End of Main ThreadI am lazy Thread I got Interrupted
		
		
		System.out.println("End of Main Thread");
	}
}
