package Thread;

class Test1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

class ThreadPriorityDemo {
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.setPriority(10);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread"); // we are not getting desire output it is problem with under lying system pls mail microsoft and get patch for thread priority support. 
		}
	}
}
