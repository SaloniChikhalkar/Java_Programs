//Q8. Write a program to print the Fibonacci series of N terms.


class Fibonacci
{
	public static void main(String args[])
	{
		int n=10;
		int a=0;
		int b=1;
		int c =0;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
			