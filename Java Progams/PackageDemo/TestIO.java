// java input/output



class TestIO
{
 	public static void main(String args[])
	{
		System.out.println("Test Output Stream..."); //output stream
		System.err.println("Test Error Stream..."); //error stream

		try{
			int i=System.in.read();// input stream
			System.out.println((char)i);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
		