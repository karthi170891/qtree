package INTERFAC;

public interface Intro {
/*
	 * blue print of class
	 * 
	 * doesnot contain main method
	 * doesnot contain static mehtod
	 * will have nonstatic method with default keyword
	 * wll have abstract method
	 * 
	 *      nonstatic
	 *      will not have abstract keyword
	 *      will be empty in its own place
	 *      will be redefined in the clss to which interface connects
	 *      
	 *      class<=> class : extends
	 *      class<=> interface: implements
	 *      
	 *      class definition=> implements interfacenam3
	 * */
	
	// nonstatic default method
	default public void nm()
	{
		System.out.println("default method");
	}
	
	//abstract method
	public void ab();

}
