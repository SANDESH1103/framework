package String;

public class CreditCard {
//static String x="xxxx-xxxx-xxxx-";

public static String Modify(String number) {
	String x="xxxx-xxxx-xxxx-";
	//StringBuffer sb=new StringBuffer(number);
	//sb.substring(15,19);  we dont use ref for it so it is anonymous object eligible for garbage collection.
	StringBuffer sb=new StringBuffer(x);
	sb.append(number,15,19);
	
	return sb.toString();                                                // 1st solution//number.substring(15,19)
}

public static void main(String[] args) {
	//StringBuffer sb=new StringBuffer();
	System.out.println(CreditCard.Modify("1234-5678-9010-1050"));
    }
}
