package InnerClass;

public class Popcorn {
	public static void main(String[] args) {
		Test p = new Test();
		p.taste();
		Test p1 = new Test() // create object for anaymous inner class not for test class.
		{
			public void taste() {
				System.out.println("spicy");
			}

		};// Semi colon must be here for ananymous inner class.
		p1.taste();
		Test p2 = new Test() {
			public void taste() {
				System.out.println("Sweet");
			}
		};
		p2.taste();
		// Names for anonymous and normal class
		System.out.println(p.getClass().getName());// Test
		System.out.println(p1.getClass().getName());// Popcorn$1 anonymous class create inside popcorn class thats why
													// name is Popcorn$1
		System.out.println(p2.getClass().getName());// Popcorn$2

	}

}

class Test {
	public void taste() {
		System.out.println("salty");
	}
}
// The generated.class files are Test.class,Popcorn.class,Popcorn$1.class,Popcorn$2.class.