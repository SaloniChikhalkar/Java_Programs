//instance initializer block.

class Truck
{
int Speed;
public Truck()
{
System.out.println("Speed of truck is: "+Speed);
System.out.println("Constructor Executed..");
}

{
	Speed=50;
	System.out.println("Instance initializer block executed....");
}

public static void main(String args[])
{
Truck t1= new Truck();
Truck t2= new Truck();
}
}