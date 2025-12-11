import java.util.*;
class hasNextTokenMethod
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner("My age is 21 years");
		
		boolean hasNextToken=sc.hasNext();//hasNext() gives us boolean valueeither true or false.
		System.out.println("Does my String contains next token?\n"+hasNextToken); 
	}
}