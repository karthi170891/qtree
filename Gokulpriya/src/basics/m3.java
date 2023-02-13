package basics;

public class m3 {
	public static void main(String[] args) {
		
		//classname objectname= new classname();
		// objectname.methodname();
		
		
		m3 ob= new m3();
		ob.prod();
		ob.add();
		
		// area of square : public
		// div of two numbers: private 
		
	}
	
	public void prod()
	{
		float a=9.4f;
		float b=3.4f;
        System.out.println("product of two numbers "+ a*b);
	
	}
	
	
	private void add()
	{
		int a=4;
		int b=3;
		System.out.println("Addition of two numbers "+ (a+b));
	}

}

/*should be created outside the main method
 * should be called inside the main method
 * 
 * non static: we need to allocate memory space
 * 
 * 
 * syntax for creation:   accessmodifier returntype name(){}
 * 
 * syntax for calling:
 * 
 *       step1:    classname objectname= new classname();
 *       step2:    objectname.methodname();
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
