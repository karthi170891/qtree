package collectionframework;

import java.util.Hashtable;

public class ht {

	public static void main(String[] args) {
		
		Hashtable<Integer,String>t= new Hashtable<>();
		t.put(3, "cat");
		t.put(4, "dog");
		t.put(0, "ant");
		t.put(1, "banana");
		System.out.println(t);
		
		//remove: key
		t.remove(0);
		System.out.println(t);
		
		System.out.println(t.get(1));
		
		System.out.println(t.keySet());
		
		System.out.println(t.entrySet());
		
		System.out.println(t.values());
		
	}
}
