package collectionframework;

import java.util.ArrayList;

public class l2 {
public static void main(String[] args) {
	
	ArrayList<String>l= new ArrayList<>();
	l.add("hello");
	l.add("hi");
	l.add("wel");
	l.add("come");
	l.add("bye");
	System.out.println(l);
	
	// index    0     1   2    3     4
	// element hello hi  wel  come   bye  
	
	// remove
	l.remove(1);
	System.out.println(l);
	
	// retrival
	System.out.println(l.get(0));
	
	//iteration: enhanced for loop/for each loop
	// syntax:
	// for(datatype tempvariable: nameofthecollection)
	//{}
	
	for(String x: l)
	{
		System.out.println(x);
	}
}
}
