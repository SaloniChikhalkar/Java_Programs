//how user can raise the exception in java program ?: using throw keyword.
//throw keyword : we can raise exception using throw keyword.
class ThrowDemo
{
	public static void Validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("this person is not allowed to vote....");
		}
		else
		{
			System.out.println("valid voting age...");
		}
	}
	
	public static void main(String args[])
	{
		try
		{
			Validate(14);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			System.out.println("Rest of the code...");
	}
}
