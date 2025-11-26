//Satic Method


class StaticMethod
{
int e_id=1;
String e_name="saloni";
static String c_name="fct";

StaticMethod(int e_id,String e_name)
{
this.e_id=e_id;
this.e_name=e_name;
}
static void change()
{
	c_name="XYZ";
}

void show()
{
	c_name="FCTP";
	System.out.println("id: "+e_id+" Emp_name: "+e_name+" Company: "+c_name);
}

public static void main(String args[])
{
 StaticMethod d1= new StaticMethod(11,"Sanika");
 StaticMethod d2= new StaticMethod(12,"siddhi");
  change();
  d1.show();
  d2.show();
}
}