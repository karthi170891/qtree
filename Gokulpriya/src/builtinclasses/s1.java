package builtinclasses;

import java.util.Scanner;

public class s1 {
public static void main(String[] args) {
	//Scanner: get input from the user at run time
	// non static in nature
	// int=> next int()
	//string=> nextline()
	//double=nextdouble()
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter your name :");
	String n=s.nextLine();
	
	System.out.println("Enter your age :");
	int age=s.nextInt();
	
	System.out.println("Enter your salary :");
	double s2=s.nextDouble();
	
	System.out.println("Name is "+ n);
	System.out.println("age is "+ age);
	System.out.println("salary is "+ s2);
}
}
