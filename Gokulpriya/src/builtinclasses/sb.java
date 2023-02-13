package builtinclasses;

public class sb {
	public static void main(String[] args) {
		
		StringBuffer n= new StringBuffer("Welcome");
		//  index    0   1   2    3   4    5    6    
		//           W   e   l    c   o    m    e
		// nonstatic 
		System.out.println(n.length());
		System.out.println(n.indexOf("l"));
		System.out.println(n.charAt(0));
		
		// insert, append
		System.out.println(n.append("all"));
		System.out.println(n.insert(1, 'e'));
		
		//deleting
		System.out.println(n.deleteCharAt(1));
		System.out.println(n.delete(7, 10));  //7,8,9
		
		//reversing
		System.out.println(n.reverse());
		System.out.println(n.reverse());
		
		//replace
		System.out.println(n.replace(0, 2, "ME"));
		
		System.out.println(n);
	}

}
