//staticmethod
class TestCube
{

	static int cube(int x)
	{
		return x*x*x;
	}
}

public class calculate
{

	public static void main(String args[])
	{
		int res=TestCube.cube(5);
		System.out.println("Cube of a number: "+res);
	}
}
