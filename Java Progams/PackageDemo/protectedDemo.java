package package1;
public class protectedDemo
{
	protected int a=11;
	public static void main(String args[])
	{
		protectedDemo d1 = new protectedDemo();
		System.out.println("value of a is: "+d1.a);
	}
}