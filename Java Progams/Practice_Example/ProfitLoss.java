//Find profit or loss based on cost price & selling price

class ProfitLoss
{
	public static void main(String args[])
	{
		int c_price=234;
		int s_price=432;

		if(c_price < s_price)
		{
			int profit=s_price-c_price;
			System.out.println("Profit is :"+profit);
		}
		else if(c_price > s_price)
		{
			int loss= c_price-s_price;
			System.out.println("loss is :"+loss);
		}
	}
}