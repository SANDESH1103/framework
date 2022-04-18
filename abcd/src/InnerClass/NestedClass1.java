package InnerClass;

public class NestedClass1 {
	static class Nested {
		public static void main(String[] args) {
			System.out.println("Static class main method");
		}
	}

	public static void main(String[] args) {
		System.out.println("Outer class main method");
	}
}
