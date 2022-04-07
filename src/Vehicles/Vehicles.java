package Vehicles;

import java.util.*;
import twowheeler.*;
import threewheeler.*;
import Fourwheeler.*;
import eightwheeler.*;


public class Vehicles {
static {
	System.out.println("WELCOME ");
}

//public void speed() {
//	System.out.println("170kmph");
//}
//public void payment() {
//	System.out.println("For more details please contact our showroom ");
//	System.out.println("If you want to bye online then select one option we have special offer for you");
//}
//public void payment1() {
//	System.out.println("Thank you for choose us we will inform you for your delivery");
//}
//public void colour() {
//	 System.out.println("Please select colour");
//	 System.out.println("1:Red");
//	 System.out.println("2:White");
//	 System.out.println("3:Black");
//}
//public void brand() {
	//System.out.println("Please select brand");
	//System.out.println("1.Suzuki|2.Tata|3.Kia");
//}
//public void fuel() {
//	System.out.println("Please select fuel Option");
//	System.out.println("1.Petrol|2.Diesel");
//}
  public static void main(String[] args) {
	  boolean done = true;
	  do {
		Scanner s=new Scanner(System.in);
		System.out.println("=============================");
		System.out.println("1:Two wheeler");
		System.out.println("2:Three wheeler");
		System.out.println("3:Four wheeler");
		System.out.println("4: OTHERS");
		System.out.println("Please select one option");
		int i1 =s.nextInt();
	//	int j1;
		
		//Vehicles ref1=new Honda();
		//Honda c=(Honda)ref1;
		//Vehicles ref2= new Shine();
		//Shine d=(Shine)ref2;
		//Vehicles ref3= new Activa();
	//	Activa e=(Activa)ref3;
	//	Vehicles ref4=new Bajaj();
	//	Bajaj f=(Bajaj)ref4;
	//	Vehicles ref5=new Pulser;
	//	Pulser g=(Pulser)ref5;
	//	Vehicles ref6=new Ct100;
	//	Ct100 h=(Ct100)ref6;
		//Vehicles ref7=new Hero();
		//Hero i=(Hero)ref7;
	//	Vehicles ref8=new PassionPro();
	//	PassionPro j=(PassionPro)ref8;
	//	Vehicles ref9=new SplenderPlus();
	//	SplenderPlus k=(SplenderPlus)ref9;
		Vehicles ref10=new Vehicles();
		TwoWheeler tw=new TwoWheeler();
	    switch(i1)
		{
	    
		case 1:
		   tw.option();
			break;
		
		case 2:
		   ThreeWheeler thw=new ThreeWheeler();
		  // ThreeWheeler c=(ThreeWheeler)ref1;
		   thw.type();
		   break;
		case 3:
			Fourwheeler fw=new Fourwheeler();
			//Fourwheeler d=(Fourwheeler)ref2;
			fw.brand();
			break;
		case 4:
			Eightwheeler ew=new Eightwheeler();
			//Eightwheeler e=(Eightwheeler)ref3;
			ew.brand();
		   break;
		   default:
			   done = false;
			   System.out.println("Please enter valid option");
			   break;
	     }
  } while(!done);
  }
}
//	switch(i3)
//	{
//	case 1:c.honda();
//	System.out.println("Please select one option");
//	int i4=s.nextInt();
//	break;
//	case 2:f.bajaj();
//	System.out.println("Please select one option");
//	int i5=s.nextInt();
//	case 3: i.hero();
//	System.out.println("Please select one option");
//	int i6=s.nextInt();
//
//	switch(i4)
//	{
//	case 1:d.colour();
//	System.out.println("Please select one option");
//	int i7=s.nextInt();
//	switch(i7)
//	{
//	case 1:d.priceR();
//	break;
//	case 2:d.priceB();
//	break;
//	case 3:d.priceW();
//	System.out.println("Please select one option");
//	int i7=s.nextInt();
//	break;
//	switch(i7)
//     {
//     case 1:ref10.payment();
//     ref2.payment();
//     System.out.println("==================");
//     System.out.println("Please enter your response");
//     int i7=s.nextInt();
//     switch(i7) {
//     
//     case 1:System.out.println("Please enter your pin");
//    	int i8=s.nextInt();
//    	switch(i8)
//    	{
//    	case 1234:
//    		 ref10.payment1();
//    		 break;
//    	}
//     }
//     
//     }
//	}
//	break;
//	    
////    default: 
////    	System.out.println("pls enter valid input");
//    	
//	}
//     //break;
//	
//	case 2: e.colour();
//	System.out.println("Please select one option");
//	int i5=s.nextInt();
//	switch(i5)
//	{
//	case 1:e.priceR();
//	System.out.println("Please select one option");
//	int i6=s.nextInt();
//     switch(i6)
//     {
//     case 1:ref10.payment();
//     ref3.payment1();
//     System.out.println("==================");
//     System.out.println("Please enter your response");
//     int i7=s.nextInt();
//     switch(i7) {
//     
//     case 1:System.out.println("Please enter your pin");
//    	int i8=s.nextInt();
//    	switch(i8)
//    	{
//    	case 1234:
//    		 ref10.payment1();
//    		 break;
//    	}
//    //default: 
////    	System.out.println("pls enter valid input");
////    	break;
//   }
//	break;
//	
//		
//    default: 
//    	System.out.println("pls enter valid input");
//    	break;
//  }
//	break;
//	
//    
//	}
//    
//    
//   
//  }
// }
//}
//  }
//}
//	System.out.println("Two wheeler");
//		System.out.println("=============================");
//		System.out.println("1:Bike");
//	System.out.println("2:Cycle");
//	System.out.println("Please select one option");
//	int j=s.nextInt();
//	switch(j)
//		{
//		case 1:
//			System.out.println("=============================");
//			System.out.println("Please select one Brand");
//			System.out.println("1:Honda");
//			System.out.println("2:Hero");
//			System.out.println("3:Bajaj");
//			System.out.println("4:Yamaha");
//			System.out.println("Please Enter one option:");
//			int k=s.nextInt();
//			switch(k)
//			{
//			case 1:
//			System.out.println("=============================");
//			System.out.println("Please select one Model");
//			System.out.println("1:Activa");
//			System.out.println("2:shine");
//			System.out.println("Please Enter one option ");
//			int l=s.nextInt();
//			switch(l)
//			{
//			case 1:
//				System.out.println("Please select one color");
//				System.out.println("1:white");
//				System.out.println("2:black");
//				System.out.println("3:red");
//				System.out.println("Please Enter one option");
//				int m=s.nextInt();
//				switch(m)
//				{
//				case 1:System.out.println("Please select price range");
//				System.out.println("70000-80000");
//				System.out.println("85000-90000");
//				System.out.println("Please enter option");
//				int n=s.nextInt();
//				switch(n)
//				{
//				case 1 :
//					System.out.println("Please select payment  option");
//					System.out.println("UPI");
//					System.out.println("INTERNET BANKING");
//					System.out.println("DEBIT CARD");
//					System.out.println("CREDIT CARD");
//					System.out.println("Please enter your option");
//					int o=s.nextInt();
//					switch(o)
//					{
//						case 1: 
//							System.out.println("forworded your response");
//					}
//					break;
//				  }
//				  break;
//				}
//				break;
//			  }
//			
//			break;	
//			}
//			//System.out.println("3:Bajaj");//
//			break;
//				
//			}
//	    
//		break;
//		}
//		
//		
//	break;
//	
//}
	/* case 2 :
	 System.out.println("Three wheeler");
	 break;
	 case 3:
	  System.out.println("Four wheeler");
	break;
	case 4:
	System.out.println("Eight wheeler");
	break;
	default: System.out.println("Please select valid input ");
	break;
	}*/
	

	
	
	
	
	
	
	
	



