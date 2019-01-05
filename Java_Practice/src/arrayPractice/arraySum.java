package arrayPractice;

public class arraySum {
	
	public static void main(String args [])
	{
		int marks[] = {10,20,30,40,50};
		int count, sum = 0;
		
		for(count = 0 ; count<marks.length; count++)
		{
			sum = sum + marks[count];
		}
		
			System.out.println(count);
			System.out.println("Sum =" + sum);	
	}

}
