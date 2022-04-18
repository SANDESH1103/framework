package InnerClass;

public class NestedClass2 {
int x=10;
static int y=20;
static class Nested{
	public void m1() {
		System.out.println(x);// CE: Non static variable x can not be reference from static context.
		System.out.println(y);
	}
 }
}
