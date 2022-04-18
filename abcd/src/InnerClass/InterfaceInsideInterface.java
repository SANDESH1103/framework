package InnerClass;

interface p1 {
	public void m1();

	interface p2 {
		public void m2();
	}
}

class Test8 implements p1 {
	public void m1() {
		System.out.println("outer interface method overlaod");
	}
}

class Test9 implements p1.p2 { // p2 is inner interface of p1 thats why we take p1.p2
	public void m2() {
		System.out.println("Inner interface method overlaod");
	}
}

public class InterfaceInsideInterface {
	public static void main(String[] args) {
		Test8 t = new Test8();
		t.m1();
		Test9 t1 = new Test9();
		t1.m2();
	}
}
