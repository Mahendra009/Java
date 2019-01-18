package arrayPractice;

import java.util.Scanner;

public class arrayMemoryAllocation {
	
	public static void main(String args[])
	{
		// syntax
		// data_type array_name = new data_type[size]; 
		// where new is a key word which has allocated the memory.
		
		int count, size ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert the size of an Arry");
		size = sc.nextInt();
		
		int marks[] = new int [size]; // here an array of 10 elements.
		
		for(count = 0; count<marks.length; count++)
		{
			System.out.print("Enter the value of an Array : marks["+count+"]=");
			marks [count] = sc.nextInt();
		}
		
		for(count = 0; count<marks.length; count++)
		{
			System.out.print(marks[count] + "  ");
		}
		
		
	}

}
