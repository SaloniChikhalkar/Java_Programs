class ifelseleap
{
public static void main(String args[])
{
int a=2000;

	if((a%4==0)&&(a%100!=0)||(a%400==0))
{
	System.out.println("Year is leap year...");
}
else
{
	System.out.println("Year is not a leap year...");
}
}
}