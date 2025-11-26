// passing this keyword as a argument.

/*class Sample
{
 void display(Sample obj)
 {
  System.out.println("Execute display Method");
 }

void Show()
{
  System.out.println("Show Method Executed");
    display(this);  //passing this keyword as a argument.
}

void info()
{
  System.out.println("Info Method Executed");
    display(this);
}

public static void main(String args[])
{

  Sample s1 = new Sample();
     s1.Show();

  Sample s2 = new Sample();
    s2.info();
}
}*/



class Sample
{
   int id;
   String name;
 public Sample(int id,String name)  //parameterised constructor.
 {
   this.id=id;
   this.name=name;
}
void display(Sample obj)
{
  System.out.println("Execute display Method");
  System.out.println("id: "+id+" Name: "+name);
 }

void Show()
{
  System.out.println("Show Method Executed");
    display(this);
}

void info()
{
  System.out.println("Info Method Executed");
    display(this);
}

public static void main(String args[])
{

  Sample s1 = new Sample(1,"saloni");
     s1.Show();

  Sample s2 = new Sample(2,"sanika");
    s2.info();
}
}