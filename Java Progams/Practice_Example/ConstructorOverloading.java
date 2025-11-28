/*Create the class Student with:
•	Default constructor
•	Parameterized constructor (name, age, grade)
*/


class Student
{
	String name;
	int age;
	String grade;
 	Student()
	{
		System.out.println("Welcome..");
	}

	Student(String name,int age,String grade)
	{
		this.name=name;
		this.age=age;
		this.grade=grade;
	}

	void ShowDetails()
	{
		System.out.println("Student Name: "+name+" Student Age: "+age+" Student Grade: "+grade);
	}
}
class ConstructorOverloading
{
	public static void main(String args[])
	{
   		Student s1= new Student();
		Student s2 = new Student("Saloni",22,"A");
		s2.ShowDetails();
	}

}