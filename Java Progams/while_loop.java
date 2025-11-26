class while_loop
{
public static void main(String args[])
{
int n=11171504;
System.out.println("Number Is: "+n);

while(n!=0)
{
int digit=n%10;
n=n/10;
System.out.println("Digits are:"+digit);
}
}
}