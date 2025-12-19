import java.util.*;
class TreeSetCFDemo
{

	public static void main(String args[])
	{
		TreeSet<Integer> t1 =new TreeSet<>();
		
		t1.add(12);
		t1.add(11);
		t1.add(25);
		t1.add(17);
		t1.add(16);
		t1.add(21);
		t1.add(9);
	
		System.out.println("TreeSet : "+t1);
		
		System.out.println("Celling MEthod : "+t1.ceiling(18));

		System.out.println("Floor Method : "+t1.floor(15));
	}
}
