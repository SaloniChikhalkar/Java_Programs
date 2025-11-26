//Herarchical  Inheritance 

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

class Tester extends Employee
{
	int bonus=5000;
	String name="Gokul";
	String skill="Java";
}

class HararchiInheritance
{
	public static void main(String args[])
	{
		Programmer p1 = new Programmer();
		System.out.println("Name:"+p1.name+"  Salary:"+p1.salary+ "  Bonus:"+p1.bonus+"  Company:"+p1.company_name+" Skill:"+p1.skill);
		
		Tester t1 = new Tester();
		System.out.println("Name:"+t1.name+"  Salary:"+t1.salary+ "  Bonus:"+t1.bonus+"  Company:"+t1.company_name+" Skill:"+t1.skill);
		
	}
} 