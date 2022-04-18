package Thread;

class Test2 extends Thread {
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Child Thread");
			Thread.yield(); // this method causes to pause the current executing thread to give chance
							// remaining threads of ***same priority***.
		}

	}
}

class YieldMethod {
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.setPriority(10); // -----(1) if we are commenting these line then both thread executes
							// simultaneously and we can expect which thread will will complete first. both
							// main & child thread priority is 5.
		t.start(); // In these program as priority of child thread is 10 it will get chance.It
					// calls yield method because of that main thread get chance more number of
					// times and chance of completing main thread first is high.
		for (int i = 1; i < 10; i++) {
			System.out.println("Main method");
		}
	}
}

// some platform won't provide proper for yield method.