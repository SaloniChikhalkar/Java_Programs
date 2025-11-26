class Balance
{
	public static void main(String args[])
	{
		Account a1= new Account();
		System.out.println(a1.viewBalance());
		System.out.println("My Current Balance is: "+a1.depositeBal(100000));
		System.out.println("YourAvailable Balance is: "+a1.withdrawBal(15000));
	}
}