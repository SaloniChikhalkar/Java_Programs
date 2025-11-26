//arrange all numbers of your array in ascending or descending order.


class Asceding
{
	public static void main(String args[])
	{
		int arr[]={10,45,65,90,34};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	System.out.println("Array of Ascending Order:");	
	for(int i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]+" ");
	}
	}
}