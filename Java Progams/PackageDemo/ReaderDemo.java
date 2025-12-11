import java.io.*;
class BufferedWriterDemo
{
	public static void main(String args[])
	{
		try
		{
			Writer w = new FileWriter("Output.txt");
			BufferedWriter bw = new BufferedWriter(w)
			String content = "I like to travel in bali..";
			bw.write(content);
			bw.close();
			System.out.println("Write Successful..");
		  
		}

		catch(Exception e)
		{
			System.out.println(e);
		}	

	}
}