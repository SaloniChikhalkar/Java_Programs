import java.util.*;

class PersonInfo
{
	int id;
	String name;
	int age;
	String city;

	PersonInfo(int id,String name,int age,String city)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.city=city;
	}
}

class TestPersonArrayList
{
	public static void main(String args[])
	{
		PersonInfo p1 = new PersonInfo(11,"saloni",22,"Kolhapur");		
		PersonInfo p2 = new PersonInfo(12,"sanika",23,"Sangli");
		PersonInfo p3 = new PersonInfo(13,"siddhi",21,"Ishwarpur");
		PersonInfo p4 = new PersonInfo(14,"prnoti",23,"Pune");

		ArrayList<PersonInfo> l1 = new ArrayList<>();

		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		l1.add(p4);

		Iterator itr = l1.iterator();
		while(itr.hasNext())
		{
			PersonInfo p = (PersonInfo)itr.next();
			System.out.println("Id : "+p.id+" Name: "+p.name+" Age : "+p.age+" City: "+p.city);
		}
	}

}






























