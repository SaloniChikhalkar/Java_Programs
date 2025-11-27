

import java.io.FileInputStream;
public class FileInputStreamTest{
	public static void main(String args[])
	{
		try{
		   FileInputStream fs=new FileInputStream("C:\\Java_Programs\\Java Progams\\FilesData\\TestFile.txt");
		   int i;
		   while((i=fs.read())!=-1)//end of text file is -1
		  {
			System.out.println((char)i);//while loop are used the data read characyer by charactetr
                  }
		   fs.close();
		   System.out.println("success............");
		   }catch(Exception e)
		  {
			System.out.println(e);
		  }
	}
}	