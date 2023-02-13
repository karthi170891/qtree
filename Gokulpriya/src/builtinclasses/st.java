package builtinclasses;

public class st {
	
	public static void main(String[] args) {
		//String=>  class and datatype
		// n=>     variable and object 
		String n="Welcome";
		//  index    0   1   2    3   4    5    6    
		//           W   e   l    c   o    m    e
		// nonstatic 
		System.out.println(n.length());
		System.out.println(n.indexOf('l'));
		System.out.println(n.charAt(0));
		
		//conversion
		System.out.println(n.toUpperCase());
		System.out.println(n.toLowerCase());
		
		// joining
		System.out.println(n+"hi");
		System.out.println(n.concat("hi"));
		
		//replace
		System.out.println(n.replace('W', 'M'));
		System.out.println(n.replace("come", "go"));
		// substring
		System.out.println(n.substring(3, 6));//3,4,5  // end index is exclusive
		
		//checking
		System.out.println(n.contains("come"));
		
		System.out.println(n);
	}

}
