package array;

public class P4 {
	public static void main(String[] args) {
		String s = "how are you              i";
		String op = "";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] != ' ') {
				op = op + c[i];
			}
		}
		System.out.println(op);
	}
}
