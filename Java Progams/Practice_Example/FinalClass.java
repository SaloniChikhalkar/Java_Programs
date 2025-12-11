/*Q29. Create a final class Vehicle
Try to extend it → show restriction.
*/


final class Vehicle
{
 	final int i=10;
	void show()
	{
		System.out.println("Number i is: " +i);
	}
}


class car extends Vehicle
{
	final String b = "saloni";

	void display()
	{
	System.out.println("number :"+i+"  Name: "+b);
	}
}

class FinalClass
{
	public static void main(String args[])
	{
		Car c = new Car();
		c.display();
	}
}