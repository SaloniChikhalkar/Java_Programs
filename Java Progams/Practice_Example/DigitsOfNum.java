//Q9. Count digits in an integer using loop.


class DigitsOfNum
{
	public static void main(String args[])
	{
		int num=234545;
		int count=0;

		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of digit in given number are: "+count);
	}
}