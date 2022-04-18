package pack1;

class S{
	String varient;
	String engine;
	String transmission;
	int capacity;
	double mileage;
	S(String varient,String engine,String transmission,int capacity,double mileage){
		this.varient=varient;
		this.engine=engine;
		this.transmission=transmission;
		this.capacity=capacity;
		this.mileage=mileage;
	}
	public static void main(String[] args) {
		S si=new S("Sigma","1462cc","Manual",4,18.66);
		System.out.println("Specifications:"  + "Varient:"+ si.varient  + "Engine:" + si.engine + "Transmission:" + si.transmission + "Seating Capacity:" + si.capacity);
	}
}
