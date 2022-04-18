package Thread;

class A8 extends Thread {
	static Thread m1;

	public void run() {

		try {
			m1.join();
		} catch (InterruptedException e) {
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}

	}
}

public class JoinMethodCase2 {
	public static void main(String[] args) throws InterruptedException {
		A8.m1 = Thread.currentThread();
		A8 t = new A8();
		t.start();
		
		for (int i = 1; i < 10; i++) {
			System.out.println("Main thread");
		}
		Thread.sleep(2000);
	}
}
// in above child thread calls join method on main thread object hence child thread has to wait until complete main thread in these case o/p is main thread followed by child thread 10 times