package abstraction;

abstract public class parent {
/*
	 * abstraction: hiding implementation details
	 *    follows inheritance
	 *    can be achieved through abstract class and abstract method
	 *    class=> abstract class: adding abstract keyword before it
	 *    abstract class
	 *        nrml method, abstract method
	 *       
	 *    abstract method
	 *         nonstatic
	 *         abstract keyword before it
	 *         will be empty in its own class
	 *         will be redefined in its derived class
	 *         
	 *     cannot create an object fr abstract class
	 * 
     * 
	 * */
	public void nm()
	{
		System.out.println("nrml method");
	}
	
	//abstract method
	
	abstract public void abs();

}
