package exceptionhandling;

import java.util.Scanner;

public class thr {
	public static void main(String[] args) {
		//syntax: throw new exceptionclass("error message")
		// create your own exception when particular condition met
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your age :");
		int age=s.nextInt();
		if(age<18)
		{
			throw new ArithmeticException("cannot vote");
		}
		
		else
		{
			System.out.println("major");
		}
	}

}
