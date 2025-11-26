// search element in an array.

class SearchElement
{
	public static void main(String args[])
	{
		int arr[]={23,45,76,89,12};
		int key=4;
                boolean found=false;

	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==key)
		{
				
			System.out.println("The "+key+" is found in the Array");
			found=true;
		}			
	}
	
	if(!found)
	{
		System.out.println("The "+key+" is not found in the Array");
	}
	}
}