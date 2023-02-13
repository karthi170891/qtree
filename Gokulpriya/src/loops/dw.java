package loops;

public class dw {
	
	public static void main(String[] args) {
		
		/*while/dowhile/for
		 * 
		 * initialisation:    where to start
		 * 
		 * condition checking: where to stop
		 * 
		 *                     forward:  <=end value
		 *                     backward: >=end value
		 *                     
		 * inc/dec :    diff between 2 consecutive numbers
		 * 
		 * syntax:
		 * 
		 * initialisation
		 * do
		 * {
		 * statement
		 * inc/de
		 * }
		 * while(condition);
		 * */
		
		// 50,45,40,35,30,....0
		
		// even numbers from 20 to 30    20,22,24,26,28,30
		
		int i=50;
		do
		{
			System.out.println(i);
			i=i-5;
		}
		while(i>=0);
	}

}
