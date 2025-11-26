//Multiple classes in single program.

class ConMethod
{
void display(int b)
{
  System.out.println("Hello fron display: "+b);
}

void show(int a)
{
  System.out.println("Hello from Show: "+a);
   display(a);
}

}
class Test
{
public static void main(String args[])
{
  ConMethod m1 = new ConMethod();
   m1.show(10);

  ConMethod m2 = new ConMethod();
   m2.show(20);
}
}

