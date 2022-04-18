package array;

public class ReverseWordWithoutChangePosition {
public static void main(String[] args) {
	String s="This is java";
	String [] s1=s.split(" ");
	for(int i=0;i<s1.length;i++)
	{
		String rev="";
		for (int j =s.length()-1; j>=0; j--) {
			rev=rev+s.charAt(j);
			
			s1[i]=rev;
		}
		
		System.out.print(s1[i]+" ");
	}
}
}
