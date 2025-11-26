// copy data of one array to another.


class CopyArray
{
	public static void main(String args[])
	{
		int arr[]={2,4,5,8,9};
		int arr1[]=new int[arr.length];

	for(int i=0;i<arr.length;i++)
	{
		arr1[i]=arr[i];
	}
	System.out.println("Original Array:");
	for(int i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]);
	}

	System.out.println("Copied Array:");
	for(int i=0;i<arr.length;i++)
	{
	System.out.println(arr1[i]);
	}
	}
}