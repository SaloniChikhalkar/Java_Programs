/*Q3. Create an abstract class Shape
•	Abstract method: calculateArea()
•	Subclasses: Circle, Rectangle
•	Accept user input and print area.
*/

import java.util.Scanner;

abstract class Shape
{	
	
	abstract void calculateArea();

}


class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}


class Rectangle extends Shape
{
	int l,w;
	Rectangle(int l,int w)
	{
		this.l=l;
		this.w=w;
	}
	
	void calculateArea()
	{
		double Area=l*w;
		System.out.println("Area of Rectangle: "+Area);
	}
}
		


class CalculateAreaCR
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);

               	System.out.print("Enter radius of circle: ");
       		 double r = sc.nextDouble();
       		 Shape s1 = new Circle(r);
       		 s1.calculateArea();
	
		System.out.print("Enter the  length and width:");
		int l= sc.nextInt();
		int w=sc.nextInt();
		Shape s2 = new Rectangle(l,w);
		s2.calculateArea();

}





//without scanner function.

/*Abstract class
abstract class Shape {
    abstract void calculateArea();
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = 3.14159 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }
}

public class ShapeArea {
    public static void main(String[] args) {

        // Hardcoded values (no scanner)
        Circle c = new Circle(5);      // Radius = 5
        Rectangle r = new Rectangle(10, 4);  // Length = 10, Width = 4

        c.calculateArea();
        r.calculateArea();
    }
}*/

}	