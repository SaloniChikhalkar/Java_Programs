class PrintDetails
{
 	public static synchronized void PrintMessage(String s) 
	{   //static synchronization

		for(int i=1;i<=5;i++)
		{
			System.out.println("good Morning...");
			System.out.println(s);
			
			try
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}	
	}
}


class MyThread1 extends Thread
{
	PrintDetails d;
	String s;
		
	MyThread1(PrintDetails d,String s)
	{
		this.d=d;
		this.s=s;
	}

	public void run()
	{
		d.PrintMessage(s);
	}
}

class StaticSynchronizationMethod
{
	public static void main(String args[])
	{
		PrintDetails obj = new PrintDetails();
		PrintDetails obj2 = new PrintDetails();
		
		MyThread1 d1 = new MyThread1(obj,"Saloni");

		MyThread1 d2 = new MyThread1(obj2,"Pranoti");


		d1.start();
		d2.start();	
	}
}





















