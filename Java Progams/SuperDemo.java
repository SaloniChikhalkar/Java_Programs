//Super keyword used to access parent class variable,methods and constructor.                

class Parent
{
	String message="Happy Diwali";
aaaaaaaaaa
void eat()
{
	System.out.println("i eat diwali sweets");
}
}

class SuperDemo extends Parent
{
	String message="Everyone";

void eat()
{
	System.out.println("i like homemade diwali sweets");
	super.eat(); //access method
}

void showMessage()
{
	System.out.println(super.message); //access variable
	System.out.println(message);

}

public static void main(String args[])
{
	SuperDemo d1 = new SuperDemo();
	d1.showMessage();
	d1.eat();
}
}