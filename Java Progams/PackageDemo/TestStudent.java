import package1.Student;
class TestStudent
{
	public static void main(String args[])
	{
		Student s1= new Student();
		s1.setId(11);
		s1.setName("Saloni");
		s1.setCity("Ishwarpur");
		System.out.println(s1.getId()+" "+s1.getName()+" " +s1.getCity());
	}
}