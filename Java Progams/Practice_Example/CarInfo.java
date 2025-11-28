/*Q2. Create a class Vehicle and subclass Car
•	Vehicle fields: brand, speed
•	Car fields: seats
•	Override method displayInfo() in both.
*/


class Vehicle
{
	 String Brand = "Fortuner";
   	 int Speed = 80;
	void DisplayInfo()
	{		
		System.out.println("Brand: "+Brand+" Speed: "+Speed);
	}
}

class Car extends Vehicle
{
     int Seats=6;
	
	void DisplayInfo()
	{
		System.out.println("Brand: "+Brand+" Speed: "+Speed+" Seats: "+Seats);
	}
}


class CarInfo
{
	public static void main(String args[])
	{
		Car c1= new Car();
		c1.DisplayInfo();
	}
}



