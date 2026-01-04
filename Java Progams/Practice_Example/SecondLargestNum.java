//Write a program to find the second largest number among three numbers.


class SecondLargestNum
{
	public static void main (String args[])
	{
		int a=10;
		int b=20;
		int c=30;

		if((a>b &&a<c)||(a<b&&a>c))
		{
			System.out.println("Second largest number is:"+a);
		}
		else if((b>a&&b<c)||(b<a&&b>c))
		{
			System.out.println("Second largest number is:"+b);
		}
		else
		{
			System.out.println("Second largest number is:"+c);
		}
	}
}