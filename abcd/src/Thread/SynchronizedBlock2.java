package Thread;
// In below  program we use class level lock and both  thread execute one by one not simultaneously
// ** because at a time only one thread access class level lock after execution of this thread it releases lock and second thread got this lock. 
class Display8 {
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
		synchronized (Display.class) { // synchronized block with class level lock
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

class MyThread8 extends Thread {
	Display8 d;
	String name;

	MyThread8(Display8 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class SynchronizedBlock2 {
	public static void main(String[] args) {
		Display8 d1 = new Display8();
		Display8 d2 = new Display8();
		MyThread8 t1 = new MyThread8(d1, "Dhoni");
		MyThread8 t2 = new MyThread8(d2, "Yuvraj");
		t1.start();
		t2.start();
	}
}
