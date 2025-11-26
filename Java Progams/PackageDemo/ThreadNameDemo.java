//how to name a thread & 00check the name of cut=rrent thread using getter and setter method.


class ThreadNameDemo extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());	
	}

	public static void main(String args[])
	{
		ThreadNameDemo d1  = new ThreadNameDemo();
		ThreadNameDemo d2 = new ThreadNameDemo();
		ThreadNameDemo d3 = new ThreadNameDemo();
			
		d1.setName("saloni"); //setting name

		System.out.println("name of thread: "+d1.getName());
		System.out.println("name of thread: "+d2.getName());
		System.out.println("name of thread: "+d3.getName());

		d2.setPriority(8); //setting  priority to the thread.

		System.out.println("Priority of thread: "+d1.getPriority());
		System.out.println("Priority of thread: "+d2.getPriority());
		System.out.println("Priority of thread: "+d3.getPriority());
		
			d1.start();  
			d2.start();
			d3.start();

			
			
	}
}