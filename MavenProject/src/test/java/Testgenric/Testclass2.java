package Testgenric;

import java.util.ArrayList;
import java.util.List;

public class Testclass2 <Y, D  >{

	
//	int a ;
//	Y b ; // generic use
//	Y demo(D c)
//	{
//		System.out.println(b);
//		return b;
	//	}
	
	
	
	public static void main(String[] args) {
		
		
/*		Testclass2 x = new Testclass2();
		x.a = 12;
		
		Testclass2<String,Character> y  = new Testclass2<String,Character>();
		y.b = "Rutuja";
		String data = y.demo('$');				*/
		
//***********************************************************************************
		//insertion
		//deletion
		//retrieval
		
	// Heterogeneous collection
	 ArrayList a  new ArrayList ();
	 a.add(23);
	 a.add('$');
	 a.add("Velocity");
	 a.add(1233.56);
	 
	 
	 //homogeneous collection
	 ArrayList<Integer>b = new ArrayList<Integer>();
	 b.add(23);
	 b.add(98);
	 b.add(32);
	 
	 List<String>c = new ArrayList<String>();
	 c.add("Shivani");
	 c.add("tyuad");
	 
	 
	 
	}

}
