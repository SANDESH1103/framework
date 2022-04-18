package Thread;
// In below example  two threads executes simultaneously thats why output is mixed or irregular.
class Display7 {
	public void wish(String name) {
		;
		;
		;
		;
		;
		;
		;
		;
		;
		; // 1lakh lines of code
		synchronized (this) { // synchronized block
			for (int i = 1; i < 10; i++) {
				System.out.print("Good morning" + " ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				System.out.println(name);
			}
		}
		;
		;
		;
		;
		;
		;
		;
		;
		;
		; // l lakh lines of code

	}
}

class MyThread7 extends Thread {
	Display7 d;
	String name;

	MyThread7(Display7 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class SynchronizedBlock1 {
	public static void main(String[] args) {
		Display7 d1 = new Display7();
		Display7 d2 = new Display7();
		MyThread7 t1 = new MyThread7(d1, "Dhoni");
		MyThread7 t2 = new MyThread7(d2, "Yuvraj");
		t1.start();
		t2.start();
	}
}
