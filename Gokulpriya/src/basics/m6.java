package basics;

public class m6 {

	public static void main(String[] args) {
		
		// other than void=> int, float, double, string, boolean
		
		//creation:  add return statement at the end
		// calling:  within sysout statement
		
		m6 ob= new m6();
		System.out.println(ob.add());
		System.out.println(ob.area());
	}
	
	
	public int add()
	{
		int a=4;
		int b=30;
		return a+b;
	}
	
	private float area()
	{
		float r=3;
		float a=r*r;
		return a;
	}
}
