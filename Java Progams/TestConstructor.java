//calling the default contructor from the parameterised constructor  with same object.

/*class ConMethod
{
public ConMethod()
{
  System.out.println("Default Constructor");
}

public ConMethod(int a)
{ 
   this();  //Always used at first statement in that method.

  System.out.println("Parameteried Constructor" +a);
}
}

class TestConstructor
{
public static void main(String args[])
{
   ConMethod m1 = new ConMethod(10);
}
}*/


//calling the parameterised contructor from the default constructor  with same object.


class ConMethod
{
public ConMethod()
{
   this(10);
  System.out.println("Default Constructor");
}

public ConMethod(int a)
{ 
  System.out.println("Parameteried Constructor : " +a);
}
}

class TestConstructor
{
public static void main(String args[])
{
   ConMethod m1 = new ConMethod();
}
}


