//compileTime exception(checked exception) : exception we get after compiling program
//1.FileNotFoundException:
//2.ClassNotFoundException:
//3.SQLexception:
//4.IOexception:
//5.InterruptedException:
//6.ParseException:
//7.MalformURLException:



//1. FileNotFoundException:

/*import java.io.FileReader;
class CompileTimeExceptionDemo  //FileNotFoundException
{
	public static void main(String args[])
	{
		try{
			FileReader fr = new FileReader("missing.txt");
		}

		catch(Exception e)
		{
			System.out.println(e); //prints details of exception
		}
	}
}*/




//2.ClassNotFoundException: 

/*class CompileTimeExceptionDemo
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.sam.ram");
		}
	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}*/


//3.InterruptedException:

class CompileTimeExceptionDemo
{
	public static void main(String args[])
	{
		try
		{
			Thread.sleep(1000);
		}
	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}




















