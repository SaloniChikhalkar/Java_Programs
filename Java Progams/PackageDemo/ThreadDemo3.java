class ThreadDemo3 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);  //sleep method used to make time distance in 2 threads
			}
			catch(Exception e)
			{
				System.out.println(e);
			}	
		   System.out.println(i);
		}
	}

	public static void main(String args[])
	{
		ThreadDemo3 t1 = new ThreadDemo3();
		ThreadDemo3 t2 = new ThreadDemo3();
		ThreadDemo3 t3 = new ThreadDemo3();
		
			//t1.run();  //works as a normal object.
			//t2.run();
			t1.start();  // it works as a thread.
			
			try
			{
				t1.join();
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			

			t2.start();

			t3.start();
	}
}