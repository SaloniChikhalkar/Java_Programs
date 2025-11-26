//thread pool: 
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class TestThreadPool
{
	public static void main(String args[])
	{
		ExecutorService executor = Executors.newFixedThreadPool(5);


		for(int i=0;i<10;i++)
		{
			Runnable W1 = new WorkerThread(" "+i);
			executor.execute(W1);
		}
		executor.shutdown();
		
		while(!executor.isTerminated())
		{}

		System.out.println("all threads finished");
	}
}


