//create a bank acc with private data members balance and public getters ans setter

public class Account
{
	private float bal;
        
	public void setBal(float bal)
	{
		this.bal=bal;
	}

	public double viewBalance()
	{
		return bal;
	}
	public float depositeBal(float amount)
	{
		if(amount>0)
		{
			bal=bal-amount;
		}
		return bal;
	}
	
	public float withdrawBal(float amount)
	{
		if(bal>amount && amount>0)
		{
			bal=bal-amount;
		}
		return bal;
	}
}