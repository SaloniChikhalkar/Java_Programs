/*Q28. Create a final method in parent
Try to override in child → show error.
*/


class FinalParent
{
	public static final void show()
	{
		System.out.println("Hello World...");
	}
}


class FinalChild extends FinalParent
{
	public static final void show()
	{
		System.out.println("Welcome...");
	}
}

class FinalTest
{
	public static void main(String args[])
	{
		FinalChild f = new FinalChild();
			f.show();
	}
}
		