/*Q23. Use super to call parent method
Class Animal → method: sound()
Class Dog overrides sound() but also calls parent sound using super.sound().
*/

class Animal
{
	void sound()
	{
		System.out.println("Cat meaw..");
	}
}	

class Dog extends Animal
{
	
	void sound()
	{
		super.sound();
		System.out.println("dogs Bark..");
	}
}


class SuperAnimal
{
	public static void main(String args[])
	{
		Dog d = new Dog();
		d.sound();
	}
}
		