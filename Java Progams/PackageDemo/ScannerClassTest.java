import java.util.*;

class ScannerObjectParameterTest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner("Hello Saloni Chikhalkar");
		
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}
	}
}