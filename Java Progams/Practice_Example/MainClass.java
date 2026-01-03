//check year is leap or not;

class LeapYear
{
	int year;
	
	LeapYear(int a)
	{
		this.year=a;

	if(year%400==0 || (year%4==0 && year%100!=0))
	{		
		System.out.println("Year is Leap Year");
	}
	else
	{
		System.out.println("Year is not leap year");
	}
	}
}


class MainClass
{
	public static void main(String args[])
	{
		
		LeapYear y1 = new LeapYear(2050);
		
	}
}