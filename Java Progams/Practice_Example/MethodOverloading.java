/*Create a class Calculator with 3 overloaded methods:
•	add(int, int)
•	add(double, double)
•	add(int, int, int)
*/



class calculator
{
	void add(int i,int j)
	{
		int sum=i+j;
		System.out.println("Welcome..."+sum);

	}

	void add(double a,double b)
	{
		double sub=a-b;
		System.out.println("Hello...."+sub);
	}


	void add(int x,int y, int z)
	{
		int mult= x*y*z;
		System.out.println("fct...."+mult);
	}
}

class MethodOverloading
{
 	public static void main(String args[])
	{
		calculator c= new calculator();
		c.add(10,20);
		c.add(4.5,2.5);
		c.add(11,12,13);
	}
}