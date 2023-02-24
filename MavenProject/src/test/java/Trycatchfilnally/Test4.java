
package Trycatchfilnally;

public class Test4 {

	public static void main(String[] args) {
		
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
			System.out.println("Alternative code ArithmeticException ");
			b=2;
		
					c=a/b;
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
		}
		System.out.println(c);
		System.out.println("End");
		

	}

}
