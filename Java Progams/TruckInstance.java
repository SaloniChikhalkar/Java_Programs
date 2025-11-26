//instance initializer block.

class TruckInstance
{
int Speed;
public  TruckInstance()
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
 TruckInstance t1= new  TruckInstance();
 TruckInstance t2= new  TruckInstance();
}
}