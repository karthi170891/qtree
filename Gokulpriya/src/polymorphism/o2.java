package polymorphism;

public class o2 {
public static void main(String[] args) {
	
	o2 ob= new o2();
	ob.area();
	ob.area(8);
	ob.area(5.6);
	ob.area(8, 9.8);
	ob.area(5.6, 8);
	
}

public  void area()//0
{
	System.out.println("area");
}

public  void area(int s)
{
	System.out.println("area of square "+s*s);
}

public void area(double r)
{
	System.out.println("area of circle");
}

public  void area(int l, double b)
{
	System.out.println("area of rec: "+ l*b);
}

public  void area( double b, int l)
{
	System.out.println("area of triangle: "+ 0.5* l*b);
}



}
