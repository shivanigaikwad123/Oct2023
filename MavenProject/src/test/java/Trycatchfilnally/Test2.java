package Trycatchfilnally;

public class Test2 {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		int a=23;
		int b=0;
		int c=0;
		
				
		try
		{
			c=a/b;
			System.out.println("Hello");
			
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
