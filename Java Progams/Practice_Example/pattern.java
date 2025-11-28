/*Q6. Print the following pattern
*
**
***
****.
*/



class pattern 
{
    	public static void main(String args[]) 
	{

        	for (int i = 1; i <= 4; i++)// Rows
		 {  
            		for (int j = 1; j <= i; j++) // Columns
	    		{ 
               			System.out.print("*");  // Print in same line
           		}
            		System.out.println(); // New line after each row
       		 }

    }
}