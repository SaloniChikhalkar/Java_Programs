/*Q3. Create an abstract class Shape
•	Abstract method: calculateArea()
•	Subclasses: Circle, Rectangle
•	Accept user input and print area.
*/

import java.util.Scanner;

class Shape
{	
	
	calculateArea();

}


class Circle extends Shape
{
	double Radius;
	Circle(int radius)
	{
		this Radius=radius;
	}
	void calculateArea()
	{
		double Area= 3.14*r*r;
		System.out.println("Area of Circle: "+Area);
	}

class CalculateAreaCR
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner();
		double Radius = sc.nextDouble();

		Circle c1 = new Circle(10);
		c1.calculateArea();
	}
}	