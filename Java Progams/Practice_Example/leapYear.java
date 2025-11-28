//Q14. Check if entered year is Leap Year


class laepYear
{
	public static void main(String args[])
	{
		int year=1900;

		if(year % 400==0 && year % 4==0 ||( year % 100 !=0))
		{
			System.out.println(year+" is a Leap Year...");
		}
		else
		{
			System.out.println(year+" is not a leap Year...");
		}
	}
}