//Q10. Reverse a number using loop (1234 → 4321).



class Reverse
{
	public static void main(String args[])
	{
		int num=1171;
		int rev=0;
		int digit=0;

		while(num>0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("Reverse of the given number: "+rev);
	}
}

