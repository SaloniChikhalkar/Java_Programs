//this keyword : used to access current instance of a class.
class Thisperson
{
String name;
int age;
String address;

public Thisperson(String name,int age,String address)
{
this.name=name;
this.age=age;
this.address=address;
System.out.println("name:"+name+"  Age:"+age+ "  Address:"+address);
}
public static void main(String args[])
{

  Thisperson t1 = new Thisperson("saloni",21,"Ishwarpur");
   
}
}

 
 