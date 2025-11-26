//inner class 
//1.member inner class
//2. local inner class
//3.Static nested class
//4.Anonymous inner class.

//1.member inner class:
/*class InnerClassDemo
{
	int a=10;

	public void display()
	{
		System.out.println("value: "+a);
	}

 	class innerClass //member inner class
	{
		void show()
		{
			System.out.println("method of inner class");
		}
	}	
	
	public static void main(String args[])
	{
		InnerClassDemo m1 = new InnerClassDemo();
		
		InnerClassDemo.innerClass in1 = m1.new innerClass();
		in1.show();
		m1.display();
	}
}*/


//2. local inner class:


/*class InnerClassDemo
{
	int a=10;

	public void display()
	{
		System.out.println("value: "+a);

 	class LocalInnerClass //Local inner class
	{
		void show()
		{
			System.out.println("method of local inner class");
		}
	}

	LocalInnerClass l1 = new LocalInnerClass();
	l1.show();	
}

	public static void main(String args[])
	{
		InnerClassDemo m1 = new InnerClassDemo();
		
		m1.display();
	}
}*/





//3.Anonymous inner class: a class without name


abstract class InnerClassDemo  //with abstract class
{
	
	abstract void run();
}

class AnonymousInnerClass
{
	public static void main(String args[])
	{
		InnerClassDemo a1= new InnerClassDemo()	
		{
			void run()
			{
				System.out.println("Anonymous class..");
			}
		};
	}
}































