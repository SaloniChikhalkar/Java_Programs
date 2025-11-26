/*WAJP to display usage od final variable and final class it 
should include final constant class which contain final 
variable as pie ,you have to use pi to calculate area of circle 
in another class which is use to calculate area of circle.*/


final class area
{
 final static double pi=3.14;
}

class AreaOfCircle
{
	public void Circle(int r)
	{
		double area1=area.pi*r*r;
		System.out.println("Area: "+area1);
	}
public static void main(String args[])
{
	AreaOfCircle a1 = new AreaOfCircle();
	a1.Circle(5);
}
}


	