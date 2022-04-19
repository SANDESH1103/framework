
public class Split {

	public static void main(String[] args) {
		String s1="Java,Eclipse,Testng,Maven";
         String [] srcStrings =s1.split(",");
         
         for (int i = 0; i < srcStrings.length; i++) {
			System.out.print(srcStrings[i] + " ");
		}
	}

}
