//Method OverRriding: occurs in two classes  which in inheritance relationship where method of parent class is exactly same as child class(same signature).

class bike
{
public int run()
{
System.out.println("Hello world...");
return 0;
}
}

class Override extends bike
{
public int run()
{
System.out.println("Welcome To Fct");
return 0;
}

public static void main(String args[])
{
Override b1 = new Override();
b1.run();
}
}
