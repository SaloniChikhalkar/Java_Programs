//inter thrad communication


class Customer
{ 
	int amount=1000;
	
	synchronized void withdraw(int amount)
	{
		System.out.println("Just go to the withdraw...");
		
		if(this.amount<amount)
		{
			System.out.println("less balance, waiting for deposit..");
			
			try
			{
				wait(); //waiting withdraw thread
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		this.amount-=amount;
		System.out.println("Withdraw completed");
	}
 	
	synchronized void Deposit(int amount)
	{
		System.out.println("Going to deposit...");
		this.amount+=amount;
		System.out.println("Deposite completed...");

		notify(); //notify deposit thread
	}
}

class InterThreadCommunication
{
	public static void main(String args[])
	{
		final Customer c = new Customer();

		new Thread()
		{
			public void run()
			{
				c.withdraw(15000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				c.Deposit(1000);
			}
		}.start();
	}
}

























