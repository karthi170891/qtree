package collectionframework;

import java.util.TreeMap;

public class m2 {
	
	public static void main(String[] args) {
		
		
		TreeMap<String, Integer>t= new TreeMap<>();
		t.put("zebra", 0);
		t.put("apple", 40);
		t.put("cat",450);
		t.put("lion", 90);
		System.out.println(t);
		
		//remove: know the key
		
		t.remove("cat");
		System.out.println(t);
		
		//retrival: know the key
		
		System.out.println(t.get("lion"));
		
		// keys
		System.out.println(t.keySet());
		
		//values
		System.out.println(t.values());
		
		//entryset
		System.out.println(t.entrySet());
		
	}

}
