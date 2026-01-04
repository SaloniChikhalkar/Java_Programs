//Write a program to validate a date (day, month, year).

import java.util.*;
class ValidateDate
{
	public static void main(String args[])
	{
		int day,month,year;
		boolean isValid = true;
		System.out.println("Enter Date: ");
		Scanner sc = new Scanner(System.in);
		day=sc.nextInt();
		month=sc.nextInt();
		year=sc.nextInt();

		if(month<1 || month >12)
		{
			System.out.println("invalid date");	
		}
		else if (month==2)	
		{
			if((year%400==0)||(year%4==0&&year%100!=0))
			{
				if(day>=1 && day<=29)
				{
					System.out.println("Valid Date");
				}
				else
				{
					System.out.println("invalid Date");
				}
			}
			else if(day>=1 && day<=29)
			{
				System.out.println("valid date");
			}
			else
			{		
				System.out.println("invalid date");
			}
		}

		else if(month==4 || month==6 || month==9 ||month==11)
		{
			if(day>=1 && day<=30)
			{
				System.out.println("valid date");
			}
			else
			{
				System.out.println("invalid date");
			}
		}
		else if(day>=1 && day<=31)
		{
			System.out.println("valid date");
		}
		else
		{
			System.out.println("invalid date");
		}
	}	
}






















 
		