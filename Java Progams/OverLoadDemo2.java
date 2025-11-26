//Method Overloading: by changging datattype of argument.

class OverLoadDemo
{
	void show(int id)
	{
		System.out.println(" Welcome");
		
	}

	void show(String name)
	{
	 	System.out.println(" welcome to fct");
	}

	

	public static void main(String args[])
	{
	 	OverLoadDemo d1 = new OverLoadDemo();
		d1.show(10);
		d1.show("saloni");
		
		
	}
}