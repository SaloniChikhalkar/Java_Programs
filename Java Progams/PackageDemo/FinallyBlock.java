//finally block : it always executes either exception is occur or not.

class FinallyBlock
{
	public static void main(String args[])
	{
		System.out.println("welcome to exception handiling...");
		
		try
		{
			//int data=25/5; // exception does not occur.
			int data=25/0;   //exception occurs.
			System.out.println(data);
		}

		/*catch(Exception e)
		{
			System.out.println(e);
		}*/
		
		catch(NullPointerException e) //exception does not match with above condition.

		{
			System.out.println(e);
		}


		finally   //finally block.
		{
			System.out.println("Finally Block Always Executes...");
		}
		System.out.println("Rest of the code..");
	}
}