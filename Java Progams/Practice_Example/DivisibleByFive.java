//check whether a number is divisible by 5 
import java.util.*;
class DivisibleByFive
{
	public static void main(String args[])
	{
		int  a;

		System.out.println("Enter number: ");

		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();

		if(a%5==0)
		{
			System.out.println("Number is Divisible by 5");
		}
		else
		{
			System.out.println("Number is not Divisible by 5");
		}
	}
}