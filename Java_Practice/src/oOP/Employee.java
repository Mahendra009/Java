package oOP;

public class Employee 
{
	private int id;
	private int basicSalary;
	private int bonus;
	private String Name;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int i)
	{
		id = i;
	}
	
	public int getBasicSalary()
	{
		return basicSalary;
	}
	public void setBasicSalary(int s)
	{
		basicSalary = s;
	}
	
	public String getName()
	{
		return Name;
	}
	public void setName(String n)
	{
		Name = n;
	}
	
	public int getBonus()
	{
		return bonus;
	}
	
	public void setBonus(int b)
	{
		bonus = b;
	}
	
	public int totalSalary()
	{
		return basicSalary + bonus;
	}
	

}
