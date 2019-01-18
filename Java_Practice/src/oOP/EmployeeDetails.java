package oOP;

public class EmployeeDetails 
{
	public static void main(String args [])
	{
		Employee emp = new Employee();
		emp.setId(1);
		emp.setBasicSalary(10000);
		emp.setBonus(5000);
		emp.setName("Trisul Malviya");
		
		System.out.println("Employee ID = " + emp.getId());
		System.out.println("Employee Name = " + emp.getName());
		System.out.println("Employee Basic Salary = " + emp.getBasicSalary());
		System.out.println("Bonus = " + emp.getBonus());
		
		
		int totalSalary = emp.totalSalary();
		System.out.println("Grand Salary = " + "Rs." +totalSalary);
	}

}
