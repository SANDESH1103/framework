package ObjectM;

public class TO {
int id;
String name;
String loc;
TO(){
	
}
public TO(int id,String name,String loc){
	this.id=id;
	this.name=name;
	this.loc=loc;
}
}
  class TO1 extends TO{
	
	int id;
	String name;
	String loc;
	public TO1(int id,String name,String loc){
		super(id,name,loc);
		
	}
	@Override
	public boolean equals(Object obj) {
		
				        TO c=(TO1)obj;
				       
				return    this.id==c.id &&
		                  this.name==c.name &&
		                  this.loc==c.loc;
				         
				        		  
				          
		                 
		
	}
 }
	
 
//
//	@Override
//	                                                    //public boolean equals(Object obj)
	                                                      //{ 
	                                                        // return this==obj;
	
                                                             //}
	                                                     // a.equals(b);
	
	
	
	
//	//public String toString()
////	{
////		System.out.println("id:"+id);
////		System.out.println("Name:"+name);
////		return "";
////	}
//	public int hashCode() {
//		return id;
//	}
// public static void main(String[] args) {
//	TO a=new TO(11,"Sundra");
//	TO a1=new TO(20,"Sundri");
//	System.out.println(a);
//	System.out.println(a.hashCode());
//	System.out.println(a1);
//	System.out.println(a1.hashCode());
//}
	

