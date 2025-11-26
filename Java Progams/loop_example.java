//write a java  program to print a number in as reverse order.
class loop_example
{
public static void main(String args[])
{
int n=1117;
int rev=0;
while(n!=0)
{
int digit=n%10;
rev=rev*10+digit;
n=n/10;
}
System.out.println("number: "+rev);
}
}