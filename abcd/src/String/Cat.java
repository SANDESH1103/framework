package String;

public class Cat {
	public static void main(String[] args) {
		String s="cats And*dogs Are-Animals";
		s=s.replaceAll("\\s","").replaceAll("[^a-zA-Z0-9]","").replace("dogs","Dogs");
		
		System.out.println(s);
	}

}
