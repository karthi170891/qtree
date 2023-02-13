package collectionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class queue {
public static void main(String[] args) {
	
	/*
	 *queue
	 *  not indexed
	 *  add
	 *  remove
	 *  retrive only head of the queue
	 *  size limited
	 *  
	 *   syntax:
	 *   
	 *   ArrayBlockingQueue<Datatype> name= new ArrayBlockingQueue<>(size);
	 * * 
	 * */
	
	ArrayBlockingQueue<Double> n= new ArrayBlockingQueue<>(4);
	n.add(9.8);
	n.add(0.8);
	n.add(4.8);
	n.add(5.8);
	System.out.println(n);
	
	//remove
	
	n.remove(9.8);
	System.out.println(n);
	
	System.out.println(n.peek());
	
	for(double x: n)
	{
		System.out.println(x);
	}
}
}
