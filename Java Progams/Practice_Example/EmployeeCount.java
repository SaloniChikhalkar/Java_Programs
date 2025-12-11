/*Q24. Count how many objects are created
Create class Employee.
Use a static counter to track object count.
*/


class Employee
{
	static int count=0;

	Employee()
	{
		count++;	
	}
}
	

class EmployeeCount
{
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();
		
		System.out.println("Total count is : "+Employee.count);
	}
}
		
	