import java.io.*;
class BufferedReaderDemo
{
	public static void main(String args[])
	{
		try
		{
			Reader r = new FileReader("Output1.txt");
			BufferedReader br = new BufferedReader(r);
			int data;
			while((data=br.read())!=-1)
			{
				System.out.println((char)data);
			}
			br.close();
			r.close();
	
		  
		}

		catch(Exception e)
		{
			System.out.println(e);
		}	

	}
}