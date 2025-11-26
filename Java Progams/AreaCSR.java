//WAP to calculate  area of circle ,square and rectangle using method overloading.

class AreaCSR
{

void area(int r)
{
	double res = 2*3.14*r*r;
	System.out.println("Area of circle is: "+res);
}

void area(double side)
{
	double res = side*side;
	System.out.println("Area Of Square is: "+res);
}

void area(int a,int b)
{
 	int res = a*b;
	System.out.println("Area of Rectangle is: "+res);
}

public static void main(String args[])
{
	AreaCSR a1 = new AreaCSR();
	a1.area(10);
	a1.area(5.0);
	a1.area(20,10);
}
}