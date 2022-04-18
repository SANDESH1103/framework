package Thread;
// case study from line 34 to 39
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

public class Synchronization1 {
	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread t1 = new MyThread(d1, "Dhoni");
		MyThread t2 = new MyThread(d2, "Yuvraj");
		t1.start();
		t2.start();
	}

}
// Even though wish method is sync we will get irregular output because thread are operating on different java objects.
// conclusion:- If multiple thread r operating on same java object then synchronization is required if multiple threads are operating on multiple java objects then sync is not required.