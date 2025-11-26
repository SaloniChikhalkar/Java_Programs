//Single Polymorphism: Many form of methid occurs in single class called method over loading.


class polyDemo
{
void display()
{
	System.out.println("hello");
}

void display(int a)
{
	System.out.println("value of a is: "+a);
}

void display(String name)
{
	System.out.println("name is: "+name);
}
}

class PolymorphDemo
{
	public static void main(String args[])
	{
		polyDemo p1 = new polyDemo();
		p1.display();
		p1.display(11);
		p1.display("saloni");
	}
}