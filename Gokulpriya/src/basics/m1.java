package basics;

public class m1 {
public static void main(String[] args) {
	
	m1.area();
	m1.product();
	
	// public:  area of rectangle
	// private: area of square
	
}
//accessmodifier static returntype name(){}

public static void area()
{
	int s=4;
	System.out.println("Area of square is "+s*s );
	}


private static void product()
{
	double a=8.9;
	double b=3.4;
	System.out.println("product is "+ a*b);
	}

}
/*
 * method:  block of code which performs certain action
 * 
 * methods should be created outside the main method, inside the class
 * methods should be called inside the main method
 * 
 * 
  static, nonstatic
  
  static: fixed memory space, no need to allocate separate memory space
  
  syntax fr creation:   accessmodifier static returntype name(){}
  syntax for calling:   classname.methodname()
  
  accessmodifier:  public, private, protected
  returntype:   void, int, float, double, boolean, string, char
 * 
 * 
 * 
 * 
 * 
 * 
 * */
