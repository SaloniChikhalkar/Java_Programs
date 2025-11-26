//Multilevel  Inheritance 

class Employee
{
	int salary=40000;
	String company_name="FCT";
}


class Programmer extends Employee
{
	int bonus=10000;
	String name="shyam";
	String skill="selenium";
}

class JProgrammer extends Employee
{
	int bonus=5000;
	String name="Gokul";
	String skill="Java";
}

class MultiInheritance
{
	public static void main(String args[])
	{
		Programmer p1 = new Programmer();
		System.out.println("Name:"+p1.name+"  Salary:"+p1.salary+ "  Bonus:"+p1.bonus+"  Company:"+p1.company_name+" Skill:"+p1.skill);
		
	}
} 