package pack1;
class Animal{
	int i=10;
}
class Monkey extends Animal{
	int j=20;
}
public class InstanceOf {
public static void main(String[] args) {
	Animal a=new Animal();
	System.out.println(a.i);
	System.out.println(a instanceof Object);
	System.out.println(a instanceof Animal);
	System.out.println(a instanceof Monkey);
	//while(a instanceof Monkey)
//	{
//		Monkey m=(Monkey)a;
//		System.out.println("j"+ m.j);
//	}
	
 }
}
