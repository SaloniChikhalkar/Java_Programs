//find out average of all element in array.

class Average
{
	public static void main(String args[])
	{
		int arr[]={10,45,34,45,90};
		double sum=0;

		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum is: "+sum);
		
		double avg=sum/arr.length;
		System.out.println("Average of array is: "+avg);
	}
}