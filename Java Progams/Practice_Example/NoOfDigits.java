//Check whether a number is 2-digit, 3-digit, or more.

class NoOfDigits
{
	public static void main(String args[])
	{
		int num= 17444;
		int digit=0;
		while(num!=0)
		{
			num = num/10;
			digit++;
		}

		if(digit==2)
		{
			System.out.println("Two digit Number");
		}
		else if(digit==3)
		{
			System.out.println("three digit number");
		}
		else
		{
			System.out.println("More than three digit number");
		}
	}
}