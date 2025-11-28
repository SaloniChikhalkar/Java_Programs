/*Q12. Take marks of 3 subjects & print Grade
•	≥90 → A
•	75–89 → B
•	60–74 → C
•	<60 → Fail
*/



class StudentGrades
{	
	public static void main(String args[])
	{
		int s1=90;
		int s2=85;
		int s3=95;
		double avg=(s1+s2+s3)/3;
		System.out.println("Average Marks are: "+avg);


	if(avg>=90)
	{
		System.out.println("Grade A");
	}
	else if(avg>=75&&avg<=89)
	{		
		System.out.println("Grade B");
	}
	else if(avg>=60 && avg<=74)
	{
		System.out.println("Grade C");
	}	
	else if(avg<60)
	{
		System.out.println("Grade D");
	}
	else
	{
		System.out.println("Fail");
	}
	}
}