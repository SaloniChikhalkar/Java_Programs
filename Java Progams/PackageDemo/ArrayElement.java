//Array: array declaration and initialization manually.

/*class ArrayElement
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,40,50};
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}
}*/



//array declaration and initialization using for loop.

/*class ArrayElement
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,40,50};  //normal declaration and initialization

	System.out.println("Array output using normal for loop...");
	
	for(int i=0;i<arr.length;i++) //normal for loop
	{
		System.out.println(arr[i]);
	}

	System.out.println("Array output using for-each loop...");
	
	for(int j:arr)  //for-each loop
	{
		System.out.println(j);
	}
	}
}*/

//array declaration and initialization using object.
class ArrayElement
{
	public static void main(String args[])
	{
		int arr[]=new int[5]; //using object declaration and initialization
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;

	System.out.println("Array output using normal for loop...");
	
	for(int i=0;i<arr.length;i++) //normal for loop
	{
		System.out.println(arr[i]);
	}

	System.out.println("Array output using for-each loop...");
	
	for(int j:arr)
	{
		System.out.println(j);
	}
	}
}