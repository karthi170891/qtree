package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class mp {

	public static void main(String[] args) {
		
		/*map: container: elements will be stored along with key
		 * 
		 * key: any datatype
		 * element: any datatype
		 * 
		 * add
		 * remove
		 * retrive
		 * 
		 * tremap   : keys:  alphabetical/ascending order
		 * linkedhashmap:    insertion order
		 * hashmap  :        unpredictable order
		 * 
		 * TreMap<dtype ofkey, dtypeofelement> name= new TreeMap<>();
		 * 
		 * key: String
		 * element: integer
		 * 
		 * */
		
		TreeMap<String, Integer>t= new TreeMap<>();
		t.put("zebra", 0);
		t.put("apple", 40);
		t.put("cat",450);
		t.put("lion", 90);
		System.out.println(t);
		
		
		LinkedHashMap<String, Integer>t1= new LinkedHashMap<>();
		t1.put("zebra", 0);
		t1.put("apple", 40);
		t1.put("cat",450);
		t1.put("lion", 90);
		System.out.println(t1);
		
		HashMap<String, Integer>t11= new HashMap<>();
		t11.put("zebra", 0);
		t11.put("apple", 40);
		t11.put("cat",450);
		t11.put("lion", 90);
		System.out.println(t11);
	}
}
