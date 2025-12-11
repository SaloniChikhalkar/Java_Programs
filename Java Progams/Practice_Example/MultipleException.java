/*Q17. Handle multiple exceptions
Array index out of bounds
Number format exception
In one program.
*/

class MultipleException
{
	public static void main(String args[])
	{
		try
		{
			String str = "saloni";
			int num = Integer.parseInt(str);

			int arr[]={11,17,19,99,24};
			int index =5;

			System.out.println("Print element : "+arr[index]);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Format Exception Occured..");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception Occured..");
		}
		System.out.println("Program end");
	}
}