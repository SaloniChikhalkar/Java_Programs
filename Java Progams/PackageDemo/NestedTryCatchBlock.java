//nested Try CAtch block:

class NestedTryCatchBlock
{
	public static void main(String args[])
	{
		try
		{
			int arr[]=new int[5];
			try
			{
				arr[6]=100/2; //ArrayIndexOutOfBoundsException
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			} 
			//String s=null;
			//System.out.println(s.length);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}