package polymorphism;

public class parent {
	
	/*overriding:  same methodname for differnt purpose showing difference in location
	 * method: parent: overriden method    :  only => parent object
	 * method: child: overriding method    : only => child object
	 * 
	 * non static
	 * follows inheritanc e
	 * 
	 * 
	 * */
	
	//overriden method
	public void area()
	{
		int s=4;
		System.out.println("Area of square is "+ s*s);
	}

}
