//Static Blocks


/*class StaticBlock
{
 	static{System.out.println("Static block executed...");}

	public static void main(String args[])
	{
		System.out.println("MAin method executed...");
	}
}*/


class StaticBlock
{
	int a;
 	static int b;

	StaticBlock()
	{
	}
static{b=10;System.out.println("Static block executed...");}

void show()
{
	System.out.println("a: "+a+" b: "+b);
}

public static void main(String args[])
{
System.out.println("Main Method...");
StaticBlock s1= new StaticBlock();
s1.show();
}
}

