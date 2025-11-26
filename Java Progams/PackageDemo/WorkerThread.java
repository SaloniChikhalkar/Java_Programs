//ThreadPool :group of thread always read to work is called threadPool.
//there are 3 methods to create threadpool:
	//1. newFixedThreadPool(int n)
	//2.
	//3.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
public class WorkerThread implements Runnable
{
	private String message;
	
	public WorkerThread(String s)
	{
		this.message=s;
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" (start) message= "+message);
		processmessage();
		System.out.println(Thread.currentThread().getName()+" (End)");
	}

	private void processmessage()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{		
			System.out.println(e);
		}
	}
}

		
	