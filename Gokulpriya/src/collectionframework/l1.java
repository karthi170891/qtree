package collectionframework;

import java.util.ArrayList;

public class l1 {
	
	// collection framework: store large amount of data under a single name
	// list, queue, set, map, table
	
	/*
	 * list
	 *   index based
	 *   add
	 *   remove
	 *   retrieve
	 *   iteration
	 *   add duplicates
	 *   
	 *   syntax: 
	 *   
	 *   ArrayList<Datatype> name= new ArrayList<>();
	 * datatype   wrapper class
	 *   int -    Integer
	 *   String   String
	 *   char     Character
	 *   double   Double
	 *   float    Float * 
	 * */
	public static void main(String[] args) {
		
		ArrayList<Integer>l= new ArrayList<>();
		l.add(90);
		l.add(0);
		l.add(80);
		l.add(900);
		l.add(9);
		System.out.println(l);
		
		// index    0   1   2    3     4
		// element 90   0   80   900   9
		
		// remove
		l.remove(1);
		System.out.println(l);
		
		// retrival
		System.out.println(l.get(0));
		
		//iteration: enhanced for loop/for each loop
		// syntax:
		// for(datatype tempvariable: nameofthecollection)
		//{}
		
		for(int x: l)
		{
			System.out.println(x);
		}
		
	}

}
