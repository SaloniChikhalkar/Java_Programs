class Cat extends Animal
{
	Cat(String name)
	{
	super(name);
	}
	void sound()
	{
	 System.out.println(name+" is making sound as meow");
	}
	public static void main(String args[])
	{
	Cat c1=new Cat("cat");
	c1.eat();
	c1.sound();
	}
}