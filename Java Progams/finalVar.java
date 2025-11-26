/*class finalVar
{
	final int n=50;//final variable
void Display()
{
	System.out.println("value of n: "+n);
	//n=100;
	System.out.println("value of n: "+n);
}
public static void main(String args[])
{
	finalVar v1=new finalVar();
	v1.Display();
}
}*/

//final method :
//A method with final keyword,which can not be overhidden in child class.


/*class finalMethod
{
	final void display()//final method
	{
		System.out.println("final method of parent class");
	}

}
class finalVar extends finalMethod
{
	void display()
	{
		System.out.println("final method of child class");
	}
public static void main(String args[])
{
 	finalVar v1 = new finalVar();
	v1.display();
}
}*/

//final class :
//class declared with final keyword which can not be inherited.

final class FinalClassDemo
{
	void display()
	{
		System.out.println("final method od parent class");
	}
}
class FinalClassDemo extends finalVar
{
	void display()
	{
		System.out.println("final method in child class");
	}
public static void main(String args[])
{
	FinalClassDemo d1 = new FinalClassDemo();
	d1.display();
}
}













