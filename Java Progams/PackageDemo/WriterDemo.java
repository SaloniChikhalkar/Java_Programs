import java.io.*;
class ReaderDemo
{
	public static void main(String args[])
	{
		try{
			Reader r = new FileReader("Output.txt");
			int data=r.read();
			while(data!=-1)
			{
				System.out.print((char)data);
				data=r.read();
			}
			r.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	

	}
}