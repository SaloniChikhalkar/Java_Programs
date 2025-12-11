/*Q21. Anonymous Class Example
Create an interface Message with method show().
Implement using anonymous inner class.
*/


interface Message
{
	void show();
}

class AnonymousClass
{
	public static void main(String args[])
	{
		Message m1 = new Message()
		{
			public void show()
			{
				System.out.println("this is an anonymous inner class...");
			}
		};
		
		m1.show();
	}
}