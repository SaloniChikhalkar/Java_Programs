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


class InterfaceDemo implements A,B,C
{
	double marks= 90;

	void Display()
	{
		System.out.println("Id: "+id+" Name: "+name+" City: "+city+" Marks: "+marks);
	}

public static void main(String args[])
{
	InterfaceDemo d1 = new InterfaceDemo();
	d1.Display();
}
}


























	