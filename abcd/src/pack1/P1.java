package pack1;

public class P1 {
static int i;
static {
	System.out.println("welcome"+i);
}
	static {
		i=20;
	}
	
	public static void main(String[] args) {
		System.out.println(i);
	}
}
