//Constructor chaining : calling one constructor from another contructor using thbis keyword.
  
class StudentDemo
{
int rollno;
String name,course;
float fee;

StudentDemo(int rollno,String name,String course)
{
  this.rollno=rollno;
  this.name=name;
  this.course=course;
}

 StudentDemo(int rollno,String name,String course,float fee)
{
   this(rollno,name,course); //constructor chaining or reusing constructor.
   this.fee=fee;
}

void display()
{
  System.out.println("RollNo: "+rollno+" Name: "+name+" Course: "+course+" Fee: "+fee);
}

public static void main(String args[])
{
StudentDemo s1 = new StudentDemo(1,"saloni","BCS");
StudentDemo s2 = new StudentDemo(2,"panu","BSC",30000);
  s1.display();
  s2.display();
}
}