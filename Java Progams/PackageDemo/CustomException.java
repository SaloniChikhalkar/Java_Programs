//user difine exception / custom exception.

class SaloniException
{
	public SaloniException(String str)
	{
		super(str);
	}
}

public class CustomException
{
	public static void main(String args[])
	{
		try 
		{
			throw new SaloniException("this is my custom Exception...");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code...");
	}
}