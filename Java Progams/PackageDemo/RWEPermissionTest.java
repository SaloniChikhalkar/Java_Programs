import java.io.*;
class RWEPermissionTest
{
	public static void main(String args[])
	{
		try
		{
			File f1 = new File("C:\\Java_Programs\\Java Progams\\FilesData\\Sample.txt");	
			
		
			f1.setReadable(true);
			f1.setWritable(false);
			f1.setExecutable(true);	
			
			System.out.println("is file readable: "+f1.canRead());	
			System.out.println("is file Writeable: "+f1.canWrite());	
			System.out.println("is file Executable: "+f1.canExecute());
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}