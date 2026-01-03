//check palendrome or not.

class Palendrome
{
	public static void main(String args[])
	{
		int num =343;
		int temp =num;
		int rev =0;
		
		while(num>0)
		{
			int digit=num%10; //to calculate last digit
			rev=rev*10+digit; //build reverse
			num=num/10;       //remove last digit
		}
		if(temp==rev)
		{
			System.out.println("palendrome number");
		}
		else
		{
			System.out.println("not a palendrome number");
		}
	}
}
		
			
			