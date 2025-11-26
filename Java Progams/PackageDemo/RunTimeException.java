//RunTimeException :

//1.arithmeticException:
//2.NullPointerException:
//3.ArrayIndexOutOfBoundsException:
//4.StringIndexOutOfBoundsException:

//1.ArithmeticException:

/*class RunTimeException
{
	public static void main(String args[])
	{
		int a=10;
		int b=0;
		System.out.println("welcome to Exception");
		
		try
		{
			System.out.println(a/b);   //ArtithmeticException
		}

		catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("rest of the code");
	}
}*/


//2.NUllPointerException :

/*class RunTimeException
{
	public static void main(String args[])
	{
		String s = null;
		System.out.println("welcome to Exception");
		
		try
		{
			System.out.println(s.length());   //NUllPointerException
		}

		catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("rest of the code");
	}
}*/

//3.NUmberFormatException :


/*class RunTimeException
{
	public static void main(String args[])
	{
		String s = "Saloni";
		
		System.out.println("Welcome to Exception");

		try
		{
			int no = Integer.parseInt(s);
			System.out.println(no);
		}

		catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("rest of the code");

	}
}*/

//4.ArrayIndexOutOfBoundsException:


/*class RunTimeException
{
	public static void main(String args[])
	{
		int number[] = {1,2,3,4,5,6};

		System.out.println("Welcome to Exception");

		try
		{
			int i=10;
			System.out.println(number[i]);
		}

		catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("rest of the code");

	}
}*/



//4.StringIndexOutOfBoundsException:


class RunTimeException
{
	public static void main(String args[])
	{
		String s = "Saloni";

		System.out.println("Welcome to Exception");

		try
		{
			int i=10;
			System.out.println(s.charAt(10));
		}

		catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("rest of the code");

	}
}












