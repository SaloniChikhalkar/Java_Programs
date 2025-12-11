/*Q27. Create a final variable MAX_SPEED
Try changing the value → ensure compiler error understanding.
*/



class FinalTest
{
   	final int MAX_SPEED = 120;   

   	void show()
   	{
       		System.out.println("Max Speed: " + MAX_SPEED);

       		MAX_SPEED = 150;  

	}
}

class FinalDemo
{
    public static void main(String args[])
    {
        FinalTest f = new FinalTest();
        f.show();
    }
}
