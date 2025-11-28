//Q11. Check whether a number is prime or not.

class PrimeOrNot
{
	public static void main(String args[])
	{
		int num=13;
		boolean isprime=true;
		if(num<=1)
		{
			isprime=false;
		}
		else
		{
		for(int i=2;i<=num/2;i++)
		{
			
			if(num%i==0)
			{
				isprime=false;
				break;
			}
		}
		}

	if(isprime)
	{
		System.out.println("number is prime");
	}
	else
	{
		System.out.println("Number is not prime");
	}
	}
}
		