package loops;

public class sw {

	public static void main(String[] args) {
		/*
		 *switch(expression)
		 *{
		 *case:
		 *   statement
		 *   break
		 *   
		 *case:
		 *   statement 
		 *   break
		 *   
		 *default:
		 *   statement
		 *   break;
		 *   * 
		 * */
		
		String t="rubber";
		switch(t)
		{
		case "scale":
			System.out.println("scale");
			break;
			
		case "pen":
			System.out.println("pen");
			break;
			
		case "pencil":
			System.out.println("pencil");
			break;
			
		default:
			System.out.println("doesnot match");
			break;
		
		
		}
	}
}
