//Method Overloading.

class OverLoadDemo
{
	void show()
	{
		System.out.println("Welcome");
	}

	void show(String name)
	{
	 	System.out.println(name+" welcome to fct");
	}

	void show(String name,String city)
	{
		System.out.println(name+" welcome to fct "+city);
	}

	public static void main(String args[])
	{
	 	OverLoadDemo d1 = new OverLoadDemo();
		d1.show();
		d1.show("Saloni");
		d1.show("saloni","Pune");
	}
}