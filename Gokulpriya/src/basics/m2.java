package basics;

public class m2 {
public static void main(String[] args) {
	
	
	//return type: void, int, double, float, string, boolean....
	
	// other than void :
	
	    //   creation: add return statement 
	    //   calling :  within sysout statement 
	
	System.out.println(m2.add());
	System.out.println(m2.area());
	System.out.println(m2.wish());
}



public static int add()
{
	int a=3;
	int b=4;
	int c=a+b;
	return c;
	}

private static double area()
{
	double r=3.4;
	double A=3.14*r*r;
	return A;
	}

public static String wish()
{
	
	return "Dhivya";
	}
}
