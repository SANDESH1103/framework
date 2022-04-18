package Thread;
// object level lock
class Display {
	public synchronized void wish(String name) {
		for (int i = 1; i < 10; i++) {
			System.out.println("Good morning");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println(name);

		}

	}
}

class MyThread extends Thread {
	Display d;
	String name;

	MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}
// if we are not declaring wish method as synchronized then both threads will be executed simultaneously and hence we will get irregular output
// if we declare wish method as synchronized then only one thread is allowed to execute on given display objret hence we will get regular output.
//o/p Dhoni 10 times followed by yuvraj 10 times. 
public class Synchronization {
	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d, "Yuvraj");
		t1.start();
		t2.start();
	}
}
