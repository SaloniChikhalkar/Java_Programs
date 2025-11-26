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


/*abstract class AnonymousClassDemo  //with abstract class
{
	
	abstract void run();
}

class InnerClassDemo
{
	public static void main(String args[])
	{
		AnonymousClassDemo a1= new AnonymousClassDemo()	{
		
			void run()
			{
				System.out.println("Anonymous class..");
			}
		};
               a1.run();
	}
}*/

//Anonymous inner class with interface:


/*interface A{
	void run();
}
class InnerClassDemo
{
	public static void main(String args[])
	{
		AnonymousClassDemo a1= new AnonymousClassDemo()	{
		
			void run()
			{
				System.out.println("Anonymous class..");
			}
		};
               a1.run();
	}

}*/



//Static inner class:
  
class InnerClassDemo
{
	static int data=50;

	static void display()
	{
		System.out.println("calling from ststic inner class");
	}
	static class Inner
	{
		void show()
		{
			System.out.println(data);
			display();
		}
	}

public static void main(String args[])
{
	InnerClassDemo.Inner d1 = new InnerClassDemo.Inner();
	d1.show();
}
}
































