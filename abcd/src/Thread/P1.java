package Thread;

public class P1 {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	Thread.currentThread().setName("Sandesh");
	System.out.println(Thread.currentThread().getName());
	System.out.println(10/0);
}
}
