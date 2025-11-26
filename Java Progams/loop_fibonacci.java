class loop_fibonacci
{
public static void main(String args[])
{
int a=0;
int b=1;
for(int i=1;i<=10;i++)
{
int temp=a;
System.out.println(a+b);
a=b;
b=temp+b;
}
}
}
