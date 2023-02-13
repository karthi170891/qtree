package polymorphism;

public class cob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 cob ob= new cob();
 cob ob1= new cob(8);
 cob ob2= new cob(8.9);
 cob ob3= new cob(8,8.9f);
 cob ob4= new cob(8.8f,9);
	}
	
	public cob()
	{
		System.out.println("hi");
	}
	
	
	public cob(int s)
	{
		System.out.println("pr of sqaure :" + 4*s);
	}

	
	public cob(double b)
	{
		System.out.println("per of crcle "+ 2*3.14*b);
	}

	
	public cob(int l, float b)
	{
		System.out.println("per of rect "+ 2*l*b);
	}

	
	public cob(float b, int l)
	
		{
			System.out.println("per of trn "+ l*b);
		}
	


}
