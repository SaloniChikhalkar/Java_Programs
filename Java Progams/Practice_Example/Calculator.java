//Write a program to simulate a simple calculator using switch and if-else.

import java.util.*;
class Calculator
{
	public static void main(String args[])
	{
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulus");
	
		System.out.println("Enter Your Choice: ");
		int choice;
		Scanner sc=new Scanner(System.in);
		choice =sc.nextInt();
		
		System.out.println("Enter Numbers: ");
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();

		switch(choice)
		{
		case 1:
		{	
			System.out.println("Addition is: "+(a+b));
			break;
		}
		case 2:
		{
			System.out.println("SUbstraction is: "+(a-b));
			break;
		}
		case 3:
		{	
			System.out.println("Multiplication is: "+(a*b));
			break;
		}
		case 4:
		{
			System.out.println("Division is: "+(a/b));
			break;
		}
		case 5:
		{	
			System.out.println("Modulus is: "+(a%b));
			break;
		}
		
		}
	}
}