//files in java.
//File Handling :various operation perform on the file in java program like create,open,close etc.

import java.io.File;

class FileHandlingDemo
{
	public static void main(String args[])
	{
		try
		{
			File f1 = new File("C:\\Java_Programs\\Java Progams\\FilesData\\SampleFile.txt");
			
			if(f1.createNewFile())// create a file 
			{
				System.out.println("File "+f1.getName()+" is created successfully..");
			}
			else
			{
				System.out.println("FileAlready Exists..");
			}
			System.out.println("Path of my file: "+f1.getAbsolutePath());//gives path of file.
			System.out.println("Length of my file: "+f1.length());//give length
			System.out.println("Do we have permission for read: "+f1.canRead());//read or not(T/F)
			System.out.println("Do we have permission for write: "+f1.canWrite());//write or not(t/F)

			if(f1.delete())// delete a file 
			{
				System.out.println("File "+f1.getName()+" is deleted successfully..");
			}
			else
			{
				System.out.println("Error occurs during deletion..");
			}

		}		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}