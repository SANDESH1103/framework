package Thread;

class My extends Thread {
	public void run() {

		for (int i = 1; i < 10; i++) {
			System.out.println("Child thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}

		}
	}
}

public class DemonThreadDemo1 {
	public static void main(String[] args) {
		My t = new My();
		t.setDaemon(true);//----(1)
		t.start();
		System.out.println("End of Main thread");
	}
}
// IF ARE COMMENTINF LINE 1 BOTH MAIN AND CHILD THREADS ARE NON DEMON AND HENCE BOTH THREADS WILL EXECUTED UNTIL THERE EXECUTION
// IF WE ARE NOT COMMENTING LINE 1 THEN MAIN THREAD IS NON DEMON AND CHILD THREAD IS DEMON HENCE WHENEVER MAIN THREAD TERMINATE AUTOMATICALLY CHILD THREAD WILL BE TERMONATED IN THESE CASE O/P WILL BE END OF MAIN THREAD  OR CHILD THREAD END OF MAIN THREAD.