//throws keyword : used to declare an exception .
import java.io.*;
class ThrowsTest
{
	void display()throws IOException
	{
		System.out.println("throws Example");
	}
}

class ThrowsDemo
{
	public static void main(String args[])
	{
		ThrowsTest t1 = new ThrowsTest();
		
		try
		{
			t1.display();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}