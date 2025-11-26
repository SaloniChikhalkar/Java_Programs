//interface: java does not support multiple inheritance but we can achieve using interface.

interface A
{
	int id =11;
}

interface B
{
	String name= "Saloni";
}

interface C
{
	String city ="Ishwarpur";
}


class E implements A,B,C  //multiple inheritance using interface.
{
	double marks= 90;

	void Display()
	{
		System.out.println("Id: "+id+" Name: "+name+" City: "+city+" Marks: "+marks);
	}
}

class InterfaceDemo1 extends E
{
public static void main(String args[])
{
	E e1 = new E();
	e1.Display();
}
}

