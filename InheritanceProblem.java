package InheritanceProblem;
import java.util.Scanner;
class Employee
{
	String name;
	String mobile_number;
	int age;
	int year;
	void employeeDisplay()
	{
		System.out.printf("Name: %s\nMobile number: %s\nYear of joining: %d\nAge: %d\n",name,mobile_number,year,age);
	}
}
class Manager extends Employee
{
	private String department;
	void Display()
	{
		super.employeeDisplay();
		System.out.println("Department: "+department);
	}
	Manager(String name,String mobile_number,String department,int age,int year)
	{
		super.name = name;
		super.mobile_number = mobile_number;
		super.age = age;
		super.year = year;
		this.department = department;
	}
}
public class InheritanceProblem
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Manager m = new Manager(s.nextLine(),s.nextLine(),s.nextLine(),s.nextInt(),s.nextInt());
		m.Display();
	}
}
