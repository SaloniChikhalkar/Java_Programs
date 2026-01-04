//Print Fibonacci series up to N terms.
class Fibonacci1
{
	public static void main(String args[])
	{
		int a=1;int b=2;int temp=0;

		for(int i=1;i<=10;i++)
		{
			temp=a+b;
			System.out.println(temp);
			a=b;
			b=temp;
		}
	}
}