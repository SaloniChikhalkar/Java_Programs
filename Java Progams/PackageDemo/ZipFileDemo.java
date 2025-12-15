import java.io.*;
import java.util.zip.*;
class ZipFileDemo
{
	public static void main(String args[])
	{

		String sourceFile = "C:\\Java_Programs\\Java Progams\\FilesData\\Sample.txt";
		String zipFile = "C:\\Java_Programs\\Java Progams\\FilesData\\Output.zip";
		try
		{
			FileOutputStream fos = new FileOutputStream(zipFile);
			ZipOutputStream zos = new ZipOutputStream(fos);

			File fileToZip = new File(sourceFile);

			FileInputStream fis = new FileInputStream(fileToZip);

			ZipEntry objzipentry = new ZipEntry(fileToZip.getName());

			zos.putNextEntry(objzipentry);

			byte[] b = new byte[1024];
			
			int length;
			
			while((length=fis.read(b))>=0)
			{
				zos.write(b,0,length);
			}
			
			zos.close();
			fis.close();
			fos.close();
			
		
			
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}