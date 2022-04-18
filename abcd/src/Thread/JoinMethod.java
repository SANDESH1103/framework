package Thread;

//def:-
//If  a thread wants to wait until completing some other thread then we should go for join method.
// for EX if a thread t1wants to wait until completing t2 then t1 has to call **t2.join()**.
// if t1 executes t2.join() then immediately t1 will be enter into waiting state until t2 completes once a t2 completes then t1 can continue its execution.
class A7 extends Thread {
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Seeta Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}

		}
	}
}

public class JoinMethod {
	public static void main(String[] args) throws InterruptedException {
		A7 t = new A7();
		t.start();
		t.join(); //if we comment line then both main and child threat will be executed simultaneouley and we cant expect exact output.
		          // if don't comment this line then main thread calls join method on child thread object hence main thread will wait until completing child thread in these case output is seeta thread 10 times followed by main thread.
		for (int i = 1; i < 10; i++) {
			System.out.println("Main thread");
		}

	}

}
