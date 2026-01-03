//Check whether a triangle is valid (sum of angles = 180).
import java.util.*;
class Triangle
{
	public static void main(String args[])
	{
	int a,b,c;

	System.out.println("Enter values of angles of a tringle:  ");
	Scanner sc = new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();

	if(a+b+c==180)
	{
		System.out.println("Valid angles");
	}
	else
	{
		System.out.println("invalid angles");
	}
	}
}

