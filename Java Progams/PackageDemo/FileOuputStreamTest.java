import java.io.FileOutputStream;

public class FileOuputStreamTest
{
	public static void main(String args[])
	{
		try{
			FileOutputStream fs = new FileOutputStream("C:\\Java_Programs\\Java Progams\\FilesData\\TestFile.txt");
			String s="welcome...";
			byte b[]=s.getBytes();			
			fs.write(65);
			fs.close();
			System.out.println("Success....");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}	