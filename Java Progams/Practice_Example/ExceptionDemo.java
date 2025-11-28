//Q15. Handle Divide-by-zero exception


class ExceptionDemo
{
 	public static void main(String args[])
	{
		System.out.println("Exception...");
		try
		{
			int a=10;
			int b=0;
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("I Handled Exception...");
	}
}