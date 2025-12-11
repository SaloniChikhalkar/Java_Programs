/*Q25. Use static block to initialize a message
Print “Program Loaded” when class loads.
*/


class StaticBlock
{
	static String msg;

 	static{
		 msg="Program loaded";
	}
}

class StaticBlockDemo
{
	public static void main(String args[])
	{
		StaticBlock s1 = new StaticBlock();
		System.out.println("Message is: "+StaticBlock.msg);
	}
}
