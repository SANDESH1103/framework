package Thread;

class Display4 {
	public synchronized void Displayn() {
		for (int i = 1; i < 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}

	public synchronized void Displayc() {
		for (int i = 65; i < 75; i++) {
			System.out.print((char) i);// *** convert integer to char
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}

		}
	}
}

class MyThread4 extends Thread {
	Display4 d;

	MyThread4(Display4 d) {
		this.d = d;
	}

	public void run() {
		d.Displayn();
	}

}

class MyThread5 extends Thread {
	Display4 d;

	MyThread5(Display4 d) {
		this.d = d;
	}

	public void run() {
		d.Displayc();
	}

}

public class Synchronized3 {
	public static void main(String[] args) {
		Display4 d = new Display4();
		MyThread4 t1 = new MyThread4(d);
		MyThread5 t2 = new MyThread5(d);
		t1.start();
		t2.start();
	}
}
