package encapsulation;

public class e1 {

	/*encapsulation
	 * 
	 *      data hiding
	 *      declare the variable as private
	 *      must not assign value to the variable
	 *      
	 *      can access the variable through setters and getter
	 *      
	 *      setter:  assign value to the variable
	 *      getter:  view the value stored in the variable
	 *      
	 *      setter, getter:  nonstatic in nature, public
	 *      
	 *      doesnot follow inheritance 
 * 
	 * */
	
	private String password;
	
	//setter
	public void setp(String p)
	{
		password=p;
	}
	
	//getter
	public void getp()
	{
		System.out.println(password);
	}
}
