//throws keyword:

class ThrowDemo2
{
	public static void show()throws FileNotFoundException
	{
		FileReader fr = new FileReader("c:\\user\\dekstop\\abc.txt");
		throw new FileNotFoundException();
	}

	public static void main(String args[])
	{
		try{
			show();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}