// this keyword returning reference of a class.

 class A
{
A getA()
{
   return this;
}

void message()
{
   System.out.println("Hello Everyone....");
}
}

class TestA
{
   public static void main(String args[])
{
   new A().getA().message();
}
}