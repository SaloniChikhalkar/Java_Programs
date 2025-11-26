//exception: eventt occurs (abnormal condition)in java program and it interupts(breaks) normal flow of execution.
//exception handling : managing that exception and continue the flow of  program.
//error: abnormal condition that we cant able to handle
//compileTime exception : exception we get after compiling program

class ExceptionDemo
{
	public static void main(String args[])
	{
		int a=10;
		int b=0;
		System.out.println("welcome to Exception");
		try{
		System.out.println(a/b);
		}
		
		catch(Exception e)// it is the parent class of all exceptions.
		{
			System.out.println(e);
		}

		System.out.println("rest of the code");
	}
}