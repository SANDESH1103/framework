package ObjectM;

public class NullP {
 int i=10;
 @Override
 public void finalize()
	{
		System.out.println("Clean-up done");
	}
	
 public static void main(String[] args) {
	System.out.println(new NullP().i);
	System.out.println(new NullP().i);
	System.out.println(new NullP().i);
	System.gc();
//	try
//	{
//		System.out.println(ref.i);
//	}
//	catch (Exception e) {
//		System.out.println("Succeesfully handeled");
//	}

	
	
	
 
    }
}
