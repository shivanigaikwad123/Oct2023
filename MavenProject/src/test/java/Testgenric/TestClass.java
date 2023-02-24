package Testgenric;

import TestNG.Keyword2;

				// generic declration
public class TestClass<Y> {
	
	int a ;
    Y b;         //Generic tips
    

	public static void main(String[] args) {
		
	TestClass x = new TestClass();
	x.a =23;
	x.b	= 34;
	x.b	= "Velocity";
	x.b	= '&';
	x.b	=	56.86;
	x.b	=new Keyword2();
	
	
	
	
	TestClass<String> y = new TestClass<String>();
	y.a =56;
	y.b="Shivani";
	y.b=87;
	y.b='&';
	
	TestClass<Integer> z = new TestClass<Integer>();
	z.b = 44;
	z.b='$';
	z.b ="Shivani";
	z.a=45;
	
	}

}
