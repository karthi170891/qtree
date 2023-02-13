package basics;

public class cons {

	public static void main(String[] args) {
		
		/*
		 * constructor:  special method 
		 *               takes classname as its name
		 *               initialisation purpose
		 *               doesnot contain returntype
		 *               should be created outside the main method
		 *               should be called inside the main method
		 *               
		 *               syntax for creation:   accessmodifier classname(){}
		 *               syntax for calling:   classname objectname= new classname();
		 * 
		 * 
		 * */
		
		cons ob= new cons();
	}
	
	
	public cons()
	{
		int l=9;
		int b=3;
		System.out.println("area of rectangle is "+ l*b);
	}
}
