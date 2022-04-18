package Thread;

class A {
	public synchronized void d1(B b) {
		System.out.println("Thread-1 start execution of d1()");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread-1 try to call B's last()");
		b.last();
	}

	public synchronized void last() {
		System.out.println("Inside A,This is last Method");
	}
}

class B {
	public synchronized void d2(A a) {
		System.out.println("Thread-2 start execution of d1()");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread-2 try to call A's last()");
		a.last();
	}

	public synchronized void last() {
		System.out.println("Inside B,This is last Method");
	}
}

public class DeadLock extends Thread {
	A a = new A();
	B b = new B();

	public void m1() {
		this.start();
		a.d1(b);// This line Executed by main Thread;
	}

	public void run() {
		b.d2(a);// This line Executed by child thread;

	}

	public static void main(String[] args) {
		DeadLock d = new DeadLock();
		d.m1();
	}
}
// in the above program if we remove atleast one sync keyword then program wont enter into deadlock hence sync keyword is only reason for deadlock situation due to this while using sync keyword we have to take special care.