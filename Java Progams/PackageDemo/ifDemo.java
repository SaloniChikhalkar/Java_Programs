class ifDemo
{
String username="admin";
String password="java123";

if(username=="admin"&&password=="java123")
{
	System.out.println("Login Successfully...");
}
else if(username=="admin"||password!="java123")
{
	System.out.println("Invalid Password...");
}
else
{
	System.out.println("Access Denied...");
}
}