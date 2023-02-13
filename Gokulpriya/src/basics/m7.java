package basics;

public class m7 {

	public static void main(String[] args) {
		
		//parameter: variable passed to a function defintiion
		//argument: value assigned to the parameter while calling the method
		
		m7.product(3.4, 2.3);// 3.4,2.3=> arguments
		
		m7 ob = new m7();
		ob.add(3, 7);  // 3and 7=> arguments 
		
		
	}
	
	
	public static void product(double a, double b)  // a and b=> parameters 
	{
		System.out.println("product of two numbers "+ (a*b));
	}
	
	public void add(int a, int b)// a and b => parameters 
	{
		System.out.println("addition of two numbers "+ (a+b));
	}
}
