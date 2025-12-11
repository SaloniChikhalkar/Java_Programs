/*Q22. Use super() to call parent constructor
Parent: Person(name)
Child: Employee(name, salary)
*/


class Person
{
	String name;

	Person(String name)
	{
	 	this.name = name;
	}
}

class Employee extends Person
{
	double salary;

	Employee(String name,double salary)
	{
		super(name);
		this.salary=salary;
		System.out.println("Employee name : "+name+" Salary: "+salary);
	}
}

class SuperKeyword
{
	public static void main(String args[])
	{
		Employee e = new Employee("saloni",1000000);
	}
}