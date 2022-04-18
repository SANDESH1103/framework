package pack1;

public class Gc {
	static int  count = 0;
public static void main(String[] args) {
	for(int i=0;i<1000000;i++)
	{
		Gc g=new Gc();
		g=null;
		
	}
	
	
}

public void finalize() {
	count++;
	System.out.println("Finalize method count:"+ count);
	
}
}
