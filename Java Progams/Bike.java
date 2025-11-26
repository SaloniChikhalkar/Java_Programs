//super keyword accessing the constructor.

class Vehicle
{
int chesisno;
String vehicleType;

public Vehicle(int chesisno,String vehicleType)
{
this.chesisno=chesisno;
this.vehicleType=vehicleType;
}
}

class Bike extends Vehicle
{
String color;
public Bike(int chesisno,String vehicleType,String color)
{
super(chesisno,vehicleType);
this.color=color;
}
void show()
{
System.out.println(super.chesisno+" "+super.vehicleType+" "+color);

}
public static void main(String args[])
{
Bike b1= new Bike(101,"SP125","Black");
b1.show();
}
}