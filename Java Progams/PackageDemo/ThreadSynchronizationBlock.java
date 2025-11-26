class Table
{
 	void PrintTable(int a) 
	{
		synchronized(this) //synchronized method in threads.
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(a*i);
			
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

		/*for(int j=1;j<=5;j++)  //only for better understanding
		{
			System.out.println("other calculation in the program");		
			try{
				Thread.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
		}*/
	
	}
}


class MyThread1 extends Thread
{
	Table t;
		
	MyThread1(Table t)
	{
		this.t=t;
	}

	public void run()
	{
		t.PrintTable(5);
	}
}


class MyThread2 extends Thread
{
	Table t;
		
	MyThread2(Table t)
	{
		this.t=t;
	}

	public void run()
	{
		t.PrintTable(100);
	}
}

class ThreadSynchronizationBlock
{
	public static void main(String args[])
	{
		Table obj = new Table();
		MyThread1 t1 = new MyThread1(obj);

		MyThread2 t2 = new MyThread2(obj);


		t1.start();
		t2.start();	
	}
}





















