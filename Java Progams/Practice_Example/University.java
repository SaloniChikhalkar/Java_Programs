/*Q20. Create a static nested class
Outer: University
Static inner: Department
Call inner class method without object of outer.
*/


class University
{
	static class Department
	{
		String Dept="Computer Science..";
	
		void display()
		{
			System.out.println("Depatment is: "+Dept);
		}
	}
	
	public static void main(String args[])
	{
		University.Department d = new University.Department();
		d.display();
	}
}	