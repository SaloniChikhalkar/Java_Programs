import java.io.Console;

class ConsoleReadTest
{
	public static void main(String args[])
	{
		Console c = System.console();
		System.out.println("Enter Your name: ");
		String name =c.readLine();
		System.out.println("Enter Your Password: ");
		char ch[] = c.readPassword();
		String pass = String.valueOf(ch);
		System.out.println("Welcome To IO Programming "+name);
		System.out.println("Your password is: "+pass);
	}
}