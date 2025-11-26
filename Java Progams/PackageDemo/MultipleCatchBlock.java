//multiple catch block: 
class MultipleCatchBlock
{
	public static void main(String args[])
	{
		try
		{
			int arr[]=new int[5];
			arr[3]=100/0; //arithmeticException
			//arr[6]=100/2; //ArrayIndexOutOfBoundsException
			//arr[4]=100/5; //runs successfully without accuring exception.
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}