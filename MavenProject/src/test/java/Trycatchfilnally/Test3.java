package Trycatchfilnally;

public class Test3 {

	public static void main(String[] args) {
		
System.out.println("start");
		
		int a=23;
		int b=2;
		int c=0;
		int  i= 3;
		int d[]= {56,35,33,55,59};
				
		try
		{
			c=a/b;
			System.out.println("Hello");
			System.out.println(d[i]);
		}
		catch(ArithmeticException e ) {
			System.out.println("Alternative code");
			b=2;
		
					c=a/b;
			
		}
		System.out.println(c);
		System.out.println("End");
		
		

	}

}
