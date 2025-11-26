class bonus
{
public static void main(String args[])
{
double salary=50000;
double Bonus=0;
int year=11;
if(year>10)
{
	Bonus=0.15*salary;
}
else if(year>=6&&year<=10)
{
	Bonus = 0.10*salary;
}
else if(year>=3&&year<=5)
{
	Bonus = 0.5*salary;
}
else
{
	System.out.println("No Bonus");
}
System.out.println("Bonus: " +Bonus);

double totalsalary = Bonus+salary;
System.out.println("Total Salary : "+totalsalary);
}
}