h/*Constructor: spl type of method having same name as a class name.
2. we can have access modifier to control object creation.
3. it does not have any return type.
4. it can accept pararmeters same as normal java methods.

-Types of Constructor  : 1.Default constructor.
                         2.Parameterised Constructor.
*/
//With Default Contructor.


/*class ConstructorDemo
{
public ConstructorDemo()
{
  System.out.println("Default onstructor Executed.");
}

public static void main(String args[])
{
  ConstructorDemo d1 = new ConstructorDemo();
  ConstructorDemo d2 = new ConstructorDemo();
  ConstructorDemo d3 = new ConstructorDemo();
}
}*/


class Student
{
 int id;
string name;
double marks;

public Student()
{

}
public void display()
{
   System.out.println("Id : "+id+" name : "+name+ "marks" +marks);
}
public static void main(String args[])
{
Student d1 = new Student();
d1.display();
}
}

