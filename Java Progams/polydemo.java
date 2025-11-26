//Method overloading: compile time polymorphism: static binding: early binding: it happens in same class.
//Method overriding: run time polymorphism: dynamic binding: late binding: it happens in inherite class.

//method overloading: 

class polydemo
{
void display()
{
	System.out.println("method in parent class");
}

void display(int a)
{
	System.out.println("methods in child class");
}
public static void main(String args[])
{
	polydemo d1=new polydemo();
	d1.display();
	d1.display(5);
}
}





/*Method overriding
class test
{
void display()
{
	System.out.println("method in parent class");
}
}
class polydemo extends test
{
void display()
{
	System.out.println("methods in child class");
}
public static void main(String args[])
{
	polydemo d1=new polydemo();
	d1.display();
}
}*/


































































