/*PROBLEM 1: STUDENT GRADE CALCULATOR 
(Conditional Statements + Exception Handling) 
Problem Statement: 
Write a Java program to calculate the final grade of a student based on three test scores. 
The program must do the following: 
1. Accept three integer marks as input (0–100). 
2. Validate that each mark is within range. 
o If a mark is invalid, throw and handle a custom exception named: 
InvalidMarksException. 
3. Compute the average and assign a grade as follows: 
Average ≥ 90 → Grade A 
Average ≥ 75 → Grade B 
Average ≥ 60 → Grade C 
Average ≥ 40 → Grade D 
Else → Grade F 
4. Display the average and the grade. */

class InvalidMarksException extends Exception 
{
	public InvalidMarksException(String message) 
	{
        	super(message);
    	}
}

public class StudentGrade
{	

	public static void StudentMarks(int marks) throws InvalidMarksException
	{
		if(marks<0 || marks>100)
		{
			throw new InvalidMarksException("Marks are not valid...");
		}
	}
	public static void main(String args[])
	{
		try
		{
		int s1=90;
		int s2=85;
		int s3=95;

		StudentMarks(s1);
            StudentMarks(s2);
            StudentMarks(s3);

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
	catch(InvalidMarksException e)
	{
		System.out.println("Exception: "+e.getMessage());
	}
	}
}




