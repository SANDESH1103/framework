package Generics;

class Gen<T> {
	T ob;

	Gen(T ob) {
		this.ob = ob;
	}

	public T getob() {
		return ob;
	}

	public void getObjectType() {
		System.out.println("The object type is:" + ob.getClass().getName());
	}
}

public class GenericClass {
	public static void main(String[] args) {
		Gen<String> g1 = new Gen<String>("Sandesh");
		System.out.println("The object insert is:" + g1.getob());
		g1.getObjectType();
		Gen<Double> g2 = new Gen<Double>(10.9);
		System.out.println("The object insert is:" + g2.getob());
		g2.getObjectType();
		Gen<Integer> g3 = new Gen<Integer>(20);
		System.out.println("The object insert is:" + g3.getob());
		g3.getObjectType();
	}
}
