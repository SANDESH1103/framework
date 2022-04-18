package pack1;

public class ConstructerChaining {
	
		ConstructerChaining(){
			this(50);
			System.out.println("no argument");
		}
		ConstructerChaining(int n){
			System.out.println("Parameterized constructer");
			
		}
		public static void main(String[] args) {
			
			ConstructerChaining ref=new ConstructerChaining();
}

}