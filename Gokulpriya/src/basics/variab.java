package basics;

public class variab {
	
	public static void main(String[] args) {
		
		//variable:  name given to a memory location
		// syntax: datatype variablename=value
		
		
		/*word:    String
		 * 
		 *letter:  char
		 *
		 *number:   int, float, double, long, short
		 *
		 *          float:  store upto 8 digits after decimal point
		 *          double: store upto 16 digits after decimal point
		 *          
		 *true/false: boolean
		 ** 
		 * 
		 * */
		//datatype variablename=value
		
		String n="dhivya";
		int age=30;
		double height=1.78;
		float weight=62.3f;
		char letter='k';
		boolean result=true;
		
		System.out.println("Name is "+ n);
		System.out.println("Age is "+ age);
		System.out.println("Height is "+ height);
		System.out.println("Weight is "+ weight);
		System.out.println("Result is "+ result);
		System.out.println("Letter is "+ letter);
		
		// addition of three numbers   :  a+b+c
		// area of circle              : 3.14*r*r
		// perimter of square          : 4*side
		// average of two numbers      : (m+n)/2
		
		int a=40;
		int b=30;
		int c=3;
		System.out.println("Addition of three numbers "+ (a+b+c));
		
		double r=9.3;
		System.out.println("Area of circle is "+ 3.14*r*r);
	}

}
