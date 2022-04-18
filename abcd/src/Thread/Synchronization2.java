package Thread;

// Class level lock------- For static synchronized method.
// every class in java has a unique lock which is nothing but class  level lock.
// if a thread wants to execute a static synchronized method then thread required class level lock 
// once thread got class level lock then it is allowed to execute any static sync method of that class 
// once a method execution completes automatically thread releases lock.
// while a thread executing static sync method the remaining threads are not allowed to execute any static sync method of that class simultaneouely 
//but remaining threads are allowed to execute the following methods are allowed simultaneously
//(1)normal  static method (2) synchronized method (object level lock)(3) non static method
// Object level lock------- For  synchronized method.
class Display1 {

	public static synchronized void wish(String name) {
		for (int i = 1; i < 10; i++) {
			System.out.print("Good morning"+" ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println(name);

		}

	}
}

class MyThread1 extends Thread {
	Display1 d;
	String name;

	MyThread1(Display1 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class Synchronization2 {
	public static void main(String[] args) {
		Display1 d1 = new Display1();
		Display1 d2 = new Display1();
		MyThread1 t1 = new MyThread1(d1, "Dhoni");
		MyThread1 t2 = new MyThread1(d2, "Yuvraj");
		t1.start();
		t2.start();
	}

}
