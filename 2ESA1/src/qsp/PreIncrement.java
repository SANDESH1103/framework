package qsp;

public class PreIncrement {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a++;
		int d = b++;
		// int e= a++;
		// int f= b++;
		System.out.println(a); // 11 //10
		System.out.println(c); // 12 //12
		System.out.println(b); // 23 //23
		System.out.println(d); // 12 //11
		// System.out.println(e);
		// System.out.println(f);

	}

}
