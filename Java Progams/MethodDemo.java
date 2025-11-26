class MethodDemo
{

public void display()
{
  System.out.println("This is my normal Method");
}

static void goOut()
{
   System.out.println("This is my static Method");
}

public static void main(String args[])
{
  System.out.println("2 raised to 2: "+Math.pow(2,2));
   
  MethodDemo m1 = new MethodDemo();
 
   m1.display();
  
   goOut();
}
}