class ThreadDemo1 extends Thread
{
	public void run()
	{
		System.out.println("thread executes..");
	}

	public static void main(String args[])
	{
		ThreadDemo1 t1 = new ThreadDemo1();
		
			t1.start();

			t1.start(); //we can't start thread twice it throws exception, IllegalThreadStateException
	}
}