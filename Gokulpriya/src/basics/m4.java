package basics;

public class m4 {
	public static void main(String[] args) {
		
		
		//returntype other than void -  int, double, float, string, boolean
		
		//creation:   add return statement at the end 
		//calling :   call within sysout statement 
		
		m4 ob= new m4();
		System.out.println(ob.add());
		System.out.println(ob.display());
	}
	
	public float add()
	{
		float a=9.4f;
		float b=3.4f;
		float c=a+b;
		return c;
	}
	
	private char display()
	{
		char letter='u';
		return letter;
	}

}
