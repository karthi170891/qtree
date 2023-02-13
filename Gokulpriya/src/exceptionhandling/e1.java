package exceptionhandling;

public class e1 {

	public static void main(String[] args) {
		
		// try, catch, throw, throws
		
		// try:  code whch is having prob of getting error
		// catch: handles the exception, will be executed only when error occurs
		
		try {
		System.out.println(5/1);
		} 
		catch(Exception e)
		{
			System.out.println("error is" + e);
		}
	}
}
