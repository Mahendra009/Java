package oOP;

public class DemoConstructer 
{
	public DemoConstructer()
	{
		System.out.println("I am inside this Constructor");
	}
	
	public static void main(String args []) 
	{
		System.out.println("I am in main Method");
		
		DemoConstructer dm = new DemoConstructer();
		
		System.out.println("I am again in main Method");
	}

}
