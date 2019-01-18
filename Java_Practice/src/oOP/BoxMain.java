package oOP;

public class BoxMain 
{
	public static void main(String args []) 
	{
		// syntax to create object
		// ClassName Object_Name = new Constructor ([Parameters]);
		
		// creating Box class object
		Box boxObj = new Box();
		
		// Initializing properties of Box class object.
		boxObj.setWidth(10);
		boxObj.setHeight(15);
		boxObj.setDepth(20);
		
		System.out.println("Width = " + boxObj.getWidth());
		System.out.println("Height = " + boxObj.getHeight());
		System.out.println("Depth = " + boxObj.getDepth());
		
		
		// We have to find Area so
		//double volume = boxObj.getWidth() * boxObj.getDepth() * boxObj.getHeight() ; // use formula of area = l*b*h
		// or
		double volume = boxObj.volume();
		// now print volume of box
		System.out.println("Volume of Box = " + " " + volume);
		
	}
}
