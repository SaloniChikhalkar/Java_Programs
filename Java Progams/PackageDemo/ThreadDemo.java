//thread in java..

/*class ThreadDemo extends Thread  //class
{
	public void run() //thread method
	{
		System.out.println("Thread is Executing..");
	}
	
	public static void main(String args[])
	{
		ThreadDemo t1=new ThreadDemo();
			t1.start(); //thread started
		
	}
}*/


/*class ThreadDemo implements Runnable
{
	public void run() //thread method
	{
		System.out.println("Thread is Executing..");
	}
	
	public static void main(String args[])
	{
		ThreadDemo t1=new ThreadDemo();
		Thread t2=new Thread(t1);
			t2.start(); //thread started
		
	}
}*/


class ThreadDemo implements Runnable  // interface
{
	public void run() //thread method
	{
		System.out.println("Thread is Executing..");
	}
	
	public static void main(String args[])
	{
		Runnable r=new ThreadDemo();
		Thread t2=new Thread(r,"My Thread..");

		String s1 = t2.getName();
		System.out.println(s1);

			t2.start(); //thread started
		
	}
}




