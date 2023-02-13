package hierrarchial;

public class parent {

	/*
	 * inheritance: process in which one class acquires properties of other class
	 * 
	 * parent/base/super :  class whose properties are inherited
	 * child/derived/sub:   class which uses properties of parent class
	 * 
	 * child is using parent class
	 * 
	 * to achieve:  child class definition=>   extends parentclassname
	 * 
	 * after inheritance:  
	 * 
	 *          child is having full control on the parent
	 *          
	 *     
	 *     
	 single:   parent<=> child
	 multiple: parent1, parent2<=> child   // java doesnot support multiple
	 hierrarchial: parent<=> child1,child2
	 multilevel: parent<=> child<=> grandchild * 
	 * 
	 * */
	
	public static void ps()
	{
		System.out.println("parent static method");
	}
	
	public  void pn()
	{
		System.out.println("parent non static method");
	}
}
