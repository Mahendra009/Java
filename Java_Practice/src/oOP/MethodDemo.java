package oOP;

public class MethodDemo 
{
	// method
	public int add(int num1,int num2)
	{
		return num1+num2;
		
	}
	
	public static void main(String args[]) 
	{
		// ClassName Object_Name = new Constructor ([Parameters]);
		MethodDemo md = new MethodDemo();
		// where MethodDemo is ClassName
		// md is objectName
		// new is a key word.
		
		//NOTE = to execute a method in a class we require the object of the class.
		//We can call the method by using objectName.methodName([parameters]);
		
		int result;
		result = md.add(50, 50);
		
		System.out.println("Result = " + result);
	}

}
 /*Method is a sub programm which does a sub task.
  * Method are implemented for modularity.
  * Syntax to create a Method.
  * 
  * Access_Specifire returnType methodName([parameters])
  * {
  *  code goes here
  * }
  * 
  * ex-
  * public int add(int num1,int num2)
	{
		return num1+num2;
		
	}
  * 
  * returnType = Any datatype - primitive, user defined datatype.
  *  if there is no return type then it will be void.
  * 
  */
    
