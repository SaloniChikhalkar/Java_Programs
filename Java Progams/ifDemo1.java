class ifDemo1
{
public static void main(String args[])
{
String username="admin1";
String password="java123
";

if (username=="admin" && password=="java123")
{
	System.out.println("Login Successfully...");
}
else if(username=="admin"&& password!="java123")
{
	System.out.println("Invalid Password...");
}
else
{
	System.out.println("Access Denied...");
}
}
}