package Thread;
class A9 extends Thread {
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

public class JoinMethodCase3 {
	public static void main(String[] args) throws InterruptedException {
		A9.m1 = Thread.currentThread();
		A9 t = new A9();
		t.start();
		t.join();
		for (int i = 1; i < 10; i++) {
			System.out.println("Main thread");
		}
		Thread.sleep(2000);
	}
}

// if main thread calls join method on child thread object and child thread calls join thread on main thread object then both threads will wait forever and program will be paused this is something like deadlock.