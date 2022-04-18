package Thread;

class Display6 {
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

class MyThread6 extends Thread {
	Display6 d;
	String name;

	MyThread6(Display6 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class SynchronizedBlock {
	public static void main(String[] args) {
		Display6 d = new Display6();
		MyThread6 t1 = new MyThread6(d, "Dhoni");
		MyThread6 t2 = new MyThread6(d, "Yuvraj");
		t1.start();
		t2.start();
	}
}
