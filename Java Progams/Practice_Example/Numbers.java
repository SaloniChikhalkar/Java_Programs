//print 1 to 10;

/*class Numbers
{
	public static void main(String args[])
	{
		System.out.println("Ptint 1 to 10 numbers:");
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}*/


/*class Numbers
{
	public static void main(String args[])
	{

		int num =1115;int rev =0;
		System.out.println("Print numbers:"+num);
		while(num>0)
		{
		int digit=num%10;
		rev= rev*10+digit;
		num=num/10;
		}
		System.out.println("reverse number:" +rev);
	}
}*/

/*class Numbers
{
	public static void main(String args[])
	{
		System.out.println("Even numbers: ");
		
		for(int i=2;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			else if(i%2!=0)
			{
				System.out.println(i);
			}			
		}
	}	
}*/

//sum of digits.

import java.util.*;
class Numbers
{
	public static void main(String args[])
	{
		int num; int sum=0;

		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		
		while(num>0)
		{
			int digit = num%10;
			sum = sum+digit;
			num=num/10;
		}
		System.out.println("sum of Digits is: "+sum);
	}
}


























