package String;

public class Pallandrome {
	public static void main(String[] args) {
		String string = "Madam";
		String rev = "";
		string = string.trim();
		for (int i = string.length() - 1; i >= 0; i--) {
			rev = rev + string.charAt(i);

		}
		if (string.equalsIgnoreCase(rev)) {
			System.out.println("String is pallendrome");
		} else {
			System.out.println("String is not pallendrome");
		}
	}
}

