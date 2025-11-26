//setting priority to the thread.
class ThreadPriorityDemo extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+ "->Priority "+Thread.currentThread().getPriority());	
	}

	public static void main(String args[])
	{
		ThreadPriorityDemo d1  = new ThreadPriorityDemo();
		ThreadPriorityDemo d2 = new ThreadPriorityDemo();
		ThreadPriorityDemo d3 = new ThreadPriorityDemo();
			
		
		System.out.println("Priority of thread: "+d1.getPriority());
		System.out.println("Priority of thread: "+d2.getPriority());
		System.out.println("Priority of thread: "+d3.getPriority());

			d1.setPriority(3); //setting  priority to the thread.
			d2.setPriority(8); //setting  priority to the thread.
			d3.setPriority(9); //setting  priority to the thread.


			System.out.println(Thread.currentThread().getName());	
			System.out.println(Thread.currentThread().getPriority());

			Thread.currentThread().setPriority(10);
			System.out.println(Thread.currentThread().getPriority());

			d1.start();  
			d2.start();
			d3.start();	

			
	}
}