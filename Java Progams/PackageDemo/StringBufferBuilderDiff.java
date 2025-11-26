//StringBuffer and Builder Methods:difference is thread safe and non-thread safe respectively.



class StringBufferBuilderDiff
{
	public static void main(String args[])
	{
		long startTime= System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("java");

		for(int i=0;i<=10000;i++)
		{
			sb.append("is easy");
		}
		System.out.println("Time taken by String Buffer is: "+(System.currentTimeMillis()-startTime));





	        startTime= System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("java");

		for(int i=0;i<=10000;i++)
		{
			sb.append("is easy");
		}
		System.out.println("Time taken by String Builder is: "+(System.currentTimeMillis()-startTime));
	}
}