class nestedifelse
{
public static void main(String args[])
{
	int age=18;
	int weight=40;
	
	if(age>=18)
	{
	if(weight>=50)
	{
	System.out.println("Allow to donate blood");
	}
	else
	{
	System.out.println("You are underweight Try next time");
	}
	}
	else
	{
	System.out.println("you are too young");
	}
}
}