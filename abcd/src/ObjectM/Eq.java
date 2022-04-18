package ObjectM;

public class Eq {
String name;
int id; 
Eq(String name,int id){
	this.name=name;
	this.id=id;
}
@Override
public boolean equals(Object obj) {
	Eq c=(Eq)obj;
	return this.name==c.name &&
			this.id==c.id;
	        
}
public static void main(String[] args) {
	Eq a= new Eq("Sundra",1);
	Eq b=new Eq("Sundra",1);
	System.out.println(a==b);
	System.out.println(a.equals(b));
}
}
