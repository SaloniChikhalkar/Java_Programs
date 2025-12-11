import java.util.*;
class InputScannerTestemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Age: ");
		int Age = sc.nextInt();

		System.out.println("Enter Salary: ");
		double Salary = sc.nextDouble();

		System.out.println("Your Name is :"+name);
		System.out.println("Your Age is :"+Age);
		System.out.println("Your Salary is :"+Salary);
		sc.close();
	}
}