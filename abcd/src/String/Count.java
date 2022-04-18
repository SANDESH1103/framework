package String;

public class Count {
	public static void main(String[] args) {
		String s="Java is a prog is lang java is used to create app";
		String [] s1=s.split(" ");
		String op="";
		
		boolean [] b=new boolean[s1.length];
		for (int i = 0; i < s1.length; i++) {
			if(b[i]==false)
			{
			int count=1;
			for (int j = i+1; j < s1.length; j++) {
				if(s1[i].equalsIgnoreCase(s1[j]))
				{
					count++;
					b[j]=true;//s1[j]="0"
				}
			}
				if(count>1)  //if(count>1&&s1[i]!=0
				{
				   op=op+s1[i] +" "+" "+"are repeated"+" " +count +" "+"times"+" " ;
				   
				}
				
			}
			
		}
		System.out.println(op +"Total duplicates :");
		
	}
}
