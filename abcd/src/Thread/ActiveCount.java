package Thread;

class My1 extends Thread {

	My1(ThreadGroup g, String name) {
		super(g, name);

	}

	public void run() {
		System.out.println("Child Thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
	}
}

public class ActiveCount {
	public static void main(String[] args) throws Exception {
		ThreadGroup pg = new ThreadGroup("ParentGroup");
		ThreadGroup cg = new ThreadGroup(pg, "ChildGroup");
		My1 t1 = new My1(pg, "ChildThread 1");
		My1 t2 = new My1(pg, "ChildThread 2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(10000);  // because of  10 sec sleeping of main thread child thread execution is over after 5 sec sleep they becomes dead. that's why active thread count is 0.
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();

	}
}
