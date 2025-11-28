/*Q13. Build a simple ATM menu
Options:
1.	Check balance
2.	Deposit
3.	Withdraw
4.	Exit
*/


class AtmMenu
{	
	public static void main(String args[])
	{
		int choice;
		double balance=1200000;
		double withdraw=15000;
		double deposit=30000;

		System.out.println("1.Check balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
	
		choice=2;
		System.out.println("Choose a Menu : "+choice);

		switch(choice)
		{
			case 1: 
			{
				System.out.println("Balance is: "+balance);
				break;
			}

			case 2: 
			{
				balance=balance+deposit;
				System.out.println(deposit+" is successfully deposited now balance is "+balance);
				break;
			}
	
			case 3:
			{		
				if(balance>=withdraw)
				{
					balance=balance-withdraw;
					System.out.println("WithDraw Amount "+withdraw+" Successfully..");
				}
				break;
			}

			default:
			{	
				System.out.println("Exit");
			}		
		}
	}
}
				











				


		