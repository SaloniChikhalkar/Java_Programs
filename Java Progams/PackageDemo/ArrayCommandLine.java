/*class ArrayCommandLine
{
	public static void main(String args[])
	{
		System.out.println("my command line array data...");
		
		for(String j:args)  //array using command line argument..
		{
			System.out.println(j);
		}
	}*/




class ArrayCommandLine
{
	public static void main(String args[])
	{
		int arr[]=new  int[5];
		System.out.println("my command line array data...");
		
		for(int i=0;i<args.length;i++)
		{
			arr[i]=Integer.parseInt(args[i]); //command line argument converting in integer data.
		}

		for(int j:arr)  //array using command line argument..
		{
			System.out.println(j);
		}
	}
}