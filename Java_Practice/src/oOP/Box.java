package oOP;

public class Box 
{
	private double height;
	private double width;
	private double depth;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double h) {
		height = (h>0)?h:1; // validation implementation
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double w) {
		width = (w>0)?w:1; // validation implementation
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double d) {
		depth = (d>0)?d:1; // validation implementation
	}
	
	//for object manipulation
	public double volume()
	{
		return width*height*depth;
	}
	
	//width = (w>0)?w:1;
	// if (w>0)
	// width = w;
	//else
	// width=1;
	
	// Similarly for height and depth
	
	
}

 /*we have to use intermediate interface(getter & setter) if above variables are declared with private Access Specifire
Getter Method : this is also called accessor method
 syntax
 Access_Specifire dataType getVariable_Name()
{
		//return class_scope_variable;
}
public double getWidth()
{
	return width;
}

 setter method :- it is also called mutator method

 syntax 
  Access_Specifire void setVariable_Name(datatype variable_name);
{
	  class_scope_variable = variable_name;

	public void setWidth(double w)
	{
		width = w;
	}*/



