class ThreadDemo2 extends Thread
{
	public void run()
	{
		System.out.println("thread executes..");
	}

	public static void main(String args[])
	{
		ThreadDemo2 t1 = new ThreadDemo2();
		
			t1.run();
	}
}