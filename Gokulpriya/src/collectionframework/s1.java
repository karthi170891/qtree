package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class s1 {
	public static void main(String[] args) {
		
		/*
		 *set
		 *   not indexed
		 *   add 
		 *   remove
		 *   retrival is not possible
		 *   duplicates cannot be added
		 *   
		 *    treeset        :    alphabetical order/ascending order
		 *    Linkedhash set :    insertion order
		 *    hashset        :    unpredictable order
		 *    
		 *    
		 *    TreeSet<Datatype> name= new TreeSet<>();
		 ** 
		 * */
		
		TreeSet<Integer> t= new TreeSet<>();
		t.add(90);
		t.add(0);
		t.add(10);
		t.add(50);
		t.add(900);
		System.out.println(t);
		
		
		LinkedHashSet<Integer> t1= new LinkedHashSet<>();
		t1.add(90);
		t1.add(0);
		t1.add(10);
		t1.add(50);
		t1.add(900);
		System.out.println(t1);
		
		
		HashSet<Integer> t11= new HashSet<>();
		t11.add(90);
		t11.add(0);
		t11.add(10);
		t11.add(50);
		t11.add(900);
		System.out.println(t11);
		
	}
}
