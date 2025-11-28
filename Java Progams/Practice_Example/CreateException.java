/*Q16. Create a custom exception InvalidAgeException
If age < 18 → throw exception.
Else print “Eligible for Voting”.
*/


class InvalidAgeException extends Exception
{
        InvalidAgeException(String msg)
	{
		super(msg);
	}
}


public class CreateException
{
	public static void main(String args[])
	{	
		int age=2;
		
		try
		{
			if(age<18)
			{
				throw new InvalidAgeException("Age is  must be greater than 18..");
			}
			else
			{
				System.out.println("Age is valid...");
			}
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Exception Message : "+e.getMessage());
		}
		System.out.println("execution is continue..");
	}
}
			