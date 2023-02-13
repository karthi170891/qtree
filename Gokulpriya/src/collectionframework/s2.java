package collectionframework;

import java.util.TreeSet;

public class s2 {
	public static void main(String[] args) {
		//linkedhashset=> Integer 
		TreeSet<String>t= new TreeSet<>();
		t.add("zebra");
		t.add("cat");
		t.add("cat");
		t.add("apple");
		t.add("tiger");
		System.out.println(t);
		
		//remove: know the value
		t.remove("tiger");
		System.out.println(t);
		
		//iteration
		// for(datatypte tempvariable: nameofthecollection)
		
		for(String x:t)
		{
			System.out.println(x);
		}
		
	}

}
