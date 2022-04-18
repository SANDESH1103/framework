package Thread;

// if the target thread never enter into sleeping or waiting state in life then there is no impact of interrupt call this is only case where interrupt call will be wasted.
// ***Note- whenever we are calling inturrupt method if target thread  not in sleeping or waiting state then there is no impact of interrupt call immediately interrupt call will be waited until target thread entered into sleeping or waiting state if the target thread enter into sleeping or waiting thread then immediately interuupt call inturrupt the target thread.  
// in the above example interrupt call waited until child thread complete for loop 10000 times.
class A11 extends Thread {
	public void run() {

		for (int i = 1; i < 10000; i++) {
			System.out.println("I am lazy Thread" + i);
		}
		System.out.println("I want rest");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("I got Interrupted");
		}
	}
}

public class InturreuptedMethod1 {
	public static void main(String[] args) {
		A11 t = new A11();
		t.start();
		t.interrupt();
		System.out.println("End of Main Thread");
	}
}
