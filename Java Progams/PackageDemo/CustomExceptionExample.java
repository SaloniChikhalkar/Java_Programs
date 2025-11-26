//create a invalidageexception for validating voting age of user ?

class InvaliAgeException extends Exception
{
public InvaliAgeException(String message)
	{
		super(message);
	}
	
}
class CustomExceptionExample{
	public static void Validate(int age)throws InvaliAgeException
	{
		if(age<18)
		{
			throw new InvaliAgeException("invalid voter age..");
		}
		else
		{
			System.out.println("valid age..");
		}
	}
	public static void main(String args[])
	{
		

		try
		{
			Validate(15);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			System.out.println("Rest of the code...");
	}
}
