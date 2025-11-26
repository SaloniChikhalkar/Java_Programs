package package1;
class TestPrivate
{
public static void main(String args[])
	{
		privateDemo p1=new privateDemo();
		System.out.println("value of a is : "+p1.a);
		p1.printDetails();
	}
}