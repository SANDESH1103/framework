package array;

public class AsendingWithoutPositionChange {
public static void main(String[] args) {
	String s="This is Java";
	String []s1=s.split(" ");
	for (int i = 0; i < s1.length; i++) {
		for (int j = i+1; j < s1.length; j++) {
			if(s1[i].length()==s1[j].length()
					)
			{
				String t=s1[i];
				s1[i]=s1[j];
				s1[j]=t;
				
		    }
			
	}
		System.out.print(s1[i]+" ");
}
	// to print array
//	for (int i = 0; i < s1.length; i++) {
//		System.out.print(s1[i] +" ");
//	}
}
}