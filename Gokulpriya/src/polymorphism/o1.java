package polymorphism;

public class o1 {
	
	public static void main(String[] args) {
		//poly- many
		
		//overloading , overiding
		//overloading:  same methodname for different purpose
		//              showing difference in number , datatype or sequence
		
		//  static, nonstatic, constructor
		
		o1.area();
		o1.area(5);
		o1.area(5.6);
		o1.area(7, 9.8);
		o1.area(8.9, 9);
	}
	
	public static void area()//0
	{
		System.out.println("area");
	}
	
	public static void area(int s)
	{
		System.out.println("area of square "+s*s);
	}
	
	public static void area(double r)
	{
		System.out.println("area of circle");
	}
	
	public static void area(int l, double b)
	{
		System.out.println("area of rec: "+ l*b);
	}
	
	public static void area( double b, int l)
	{
		System.out.println("area of triangle: "+ 0.5* l*b);
	}




}
