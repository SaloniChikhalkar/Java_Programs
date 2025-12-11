import java.util.*;

class ScannerhasNextLineMethod
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner("Hello Saloni Chikhalkar\nWelcome to fct\nFor Java Full stack course");
		
		while(sc.hasNextLine())//hasNextLine method
		{
			System.out.println(sc.nextLine());
		}
	}
}