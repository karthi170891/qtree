package exceptionhandling;

public class e3 {
public static void main(String[] args) {
		
		// try, catch, throw, throws
		
		// try:  code whch is having prob of getting error
		// catch: handles the exception, will be executed only when error occurs
		
		try {
		System.out.println(3/0);
		}
		
		catch(Exception e)
		{
			System.out.println("error is " + e);
		}
		
		finally
		{
			System.out.println("hi");
			}
		}
}
