package pack1;

public class Loop {
 int i=10;

public static void main(String[] args)
{
	Loop l=new Loop();
//	while(l.i!=0)
//		
//	{
//		System.out.println(l.i);
//		l.i--;
//	}
	//System.out.println(l.i);
	do {
		System.out.println(l.i);     //if we give statement after updation then we get value -1 than our requirement
		l.i--;
		
	} while(l.i!=0);
	
}

}