package basics;

public class m5 {
public static void main(String[] args) {
	
	//classname objectname= new classname();
	//objectname.methodname();
	
	m5 ob=new m5();
	ob.div();
	ob.add();
	
}

public void div()
{
	int a=90;
	int b=3;
	System.out.println("division of two numbers "+ a/b);}


private void add()
{
	float a=9.3f;
	float b=2.3f;
	System.out.println("Addition of two numbers "+ (a+b));
	}
}

/*
 * 
 * should be created outside the main method
 * should be called inside the main method
 * 
 * 
 * nonstatic:  we need to allocate memory space for calling it
 * 
 * syntax for creation:   accessmodifier rturntype name(){}
 * syntax for calling:
 * 
 *                 step1: object creation and naming         :   classname objectname= new classname();
 *                 step2: calling                                objectname.methodname();
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 