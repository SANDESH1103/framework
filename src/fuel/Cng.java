package fuel;
//class Auto{
//	
//  System.out.println("Please select brand");
//	}


public interface Cng {
	abstract void brand();

}
interface Lpg{
	abstract void brand1();

}
class FuelType implements Cng,Lpg{
	public void brand() {
		System.out.println("Please select brand");
	}
	public void brand1() {
		System.out.println("Please select Lpg");
	}
}


class driver {
	public static void main(String[] args) {
		FuelType ft=new FuelType();
		ft.brand();
		ft.brand1();
	}
}