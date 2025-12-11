/*Q26. Create a utility class using static methods
Methods:
•	square(int)
•	cube(int)
*/


class UtilityTest
{
	private UtilityTest(){}

	public static int Square(int a)
	{
		return a*a;
	}
	
	public static int Cube(int a)
	{
		return  a * a * a;
	}	
}


class UtilityDemo
{
	public static void main(String args[])
	{
	
		System.out.println("Square : "+UtilityTest.Square(3));
		System.out.println("Cube : "+UtilityTest.Cube(5));
	}
}
	