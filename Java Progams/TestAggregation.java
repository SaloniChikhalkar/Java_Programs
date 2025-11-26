// aggregation 

class Address
{
	String city,state,country;
	Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
}

class Employee
{
 	int emp_id;
	String emp_name;
	Address address;
	
	Employee(int emp_id,String emp_name,Address address)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.address=address;
	}
void Display()
{
	System.out.println(emp_id+" "+emp_name);
	System.out.println(address.city+" "+address.state+" "+address.country);
}
}

class TestAggregation
{
	public static void main(String args[])
	{
		Address a1 = new Address("pune","Maharashtra","India");
		Employee e1 = new Employee(101,"Saloni",a1);
		e1.Display();
	}
}