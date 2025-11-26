// Static Keyword :1.create variable,method,blocks and nested class.
//


//ex1 : difference between constant and static variable.
/*class StaticDemo{
 static int a=10;
 final static int b=100;
public static void main(String args[])
{
System.out.println(a);
System.out.println(b);
a=50;
//b=15;
System.out.println(a);
System.out.println(b);
}
}*/


//ex2 : Static variable

/*class StaticDemo
{
int e_id;
String e_name;
static String c_name="fct";

StaticDemo(int e_id,String e_name)
{
this.e_id=e_id;
this.e_name=e_name;
System.out.println("id: "+e_id+" Emp_name: "+e_name+" Company: "+c_name);
}
public static void main(String args[])
{
 StaticDemo s1= new StaticDemo(1,"Saloni");
}
}*/

//obj: stack, normal var: heap, static :class used to create var method block nesdted class is a 
//   varwhich belong the class not in obj is can share same info in all the objects

class StaticDemo
{ static int count=0;
StaticDemo()
{
count++;
System.out.println(count);
}
public static void main(String args[])
{
StaticDemo s1= new StaticDemo();
StaticDemo s2=new StaticDemo();
StaticDemo s3=new StaticDemo();
}
}



























