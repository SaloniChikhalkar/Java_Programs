package package2;
import package1.protectedDemo;

class TestProtected1 extends package1.protectedDemo
{

public static void main(String args[])
	{
		TestProtected1 d1 = new TestProtected1();
		System.out.println("value of a is: "+d1.a);
	}
}