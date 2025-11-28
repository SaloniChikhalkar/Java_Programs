/*Q1. Create a BankAccount class
•	Fields: accountNumber, holderName, balance
•	Methods: deposit(), withdraw(), showDetails()
•	Create two accounts and perform operations.
*/


class BankAccount
{
	int account_number;
	String name;
	double balance;
	

BankAccount(int acc_num,String name,double balance)
{
	this.account_number=acc_num;
	this.name=name;
	this.balance=balance;
}

void Deposit(double amount)
{
	balance=balance+amount;
	System.out.println("Balance is:"+balance);
}

void Withdraw(double amount)
{
	if(balance>=amount)
	{
		balance=balance-amount;
		System.out.println(amount+"WithDraw Successfully.....");
	}
	System.out.println("Remaining balance is:"+balance);
}


void ShowDetails()
{
	System.out.println("Account no. : "+account_number+" Name: "+name+" Balance: "+balance);
}
}

class Account
{
	public static void main(String args[])
	{
		BankAccount b1= new BankAccount(11,"saloni",100000);
		BankAccount b2= new BankAccount(12,"Pranoti",150000);

		b1.Deposit(10000);
		b1.Withdraw(5000);
		b1.ShowDetails();
		

		
		b2.Deposit(15000);
		b2.Withdraw(3000);
		b2.ShowDetails();

		
	}
}

		


























