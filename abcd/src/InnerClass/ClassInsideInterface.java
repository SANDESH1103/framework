package InnerClass;

interface Vehicles {
	public int getNumberOfWheels();

	class DefaultVehicle implements Vehicles {    // by default public static
		public int getNumberOfWheels() {
			return 2;
		}
	}
}

class Bus implements Vehicles {
	public int getNumberOfWheels() {
		return 6;
	}
}

public class ClassInsideInterface {
	public static void main(String[] args) {
		Vehicles.DefaultVehicle d = new Vehicles.DefaultVehicle(); //As DefaultVehicles  class is inside interface Vehicles. we use Vehicles.DefaultVehicles.
		System.out.println(d.getNumberOfWheels());
		Bus b=new Bus();
		System.out.println(b.getNumberOfWheels());
	}
}
