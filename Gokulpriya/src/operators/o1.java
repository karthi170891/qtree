package operators;

public class o1 {
	
	public static void main(String[] args) {
		
		/*arithmetic operators :   +,-,*,/
		 * comparision operators: <,>,<=,>=,==,!=
		 * assignment operators:  +=,-=,*=,/=
		 * conditional operators:  condition ? true : false
		 * logical operators :  and, or , not
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		int age=3;
		
		//                 cond  ?    true  : false
		System.out.println(age>18 ?  "major": "minor");
		
		// add 20 to age
		//age+=10;
		
		// sub 2 from age
		//age-=2;
		
		//multiply age by 3
		//age*=3;
		
		//divide age by 3
		//age/=3;
		//System.out.println(age);
		
		/*
		 * and => &&
		 * 
		 * con1    con2   output
		 * 
		 * True   True      True
		 * True   false     false
		 * false  True      false
		 * false  false     false
		 * 
		 * or=> ||
		 * 
		 *  con1    con2   output
		 * 
		 * True   True      True
		 * True   false     true
		 * false  True      true
		 * false  false     false
		 * 
		 * not=> !
		 * 
		 * true=> false
		 * false=> true
 * 
		 * 
		 * */
		int m=40;
		int n=30;
		System.out.println("AND");
		System.out.println(m==40 && n>20);
		System.out.println(m==40 && n>200);
		System.out.println(m==0 && n>20);
		System.out.println(m==0 && n==0);
		
		System.out.println("OR");
		System.out.println(m==40 || n>20);
		System.out.println(m==40 || n>200);
		System.out.println(m==0 || n>20);
		System.out.println(m==0 || n==0);
		
		System.out.println("not operator");
		
		System.out.println(m==0);
		System.out.println(m!=0);
	}

}
