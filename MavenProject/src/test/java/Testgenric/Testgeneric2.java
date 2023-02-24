package Testgenric;

public class Testgeneric2 <Y,D >{

	int a ;
    Y b;         //Generic tips
    D c ;
    
	public static void main(String[] args) {
		

		Testgeneric2 x = new Testgeneric2();
		x.a = 34;
		
		Testgeneric2<String,Character> y = new Testgeneric2<String,Character>();
		 
			y.a =23;
			y.b ="Shivani";
			y.c = '$';
			
			Testgeneric2<Integer,String> z =  new Testgeneric2<Integer,String>();
			z.a =34;
			z.b=67;
			z.c="dfdf";
			
			
			
			
	}

}
