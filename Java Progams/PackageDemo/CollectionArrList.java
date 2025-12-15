//how to ocreate collection in java?
import java.util.*;
class CollectionArrList
{
	public static void main(String args[])
	{
		ArrayList l1= new ArrayList();
		
		l1.add(11);//add element into list using add() method.
		l1.add("Saloni");
		l1.add("Female");
		l1.add(99.99);
		l1.add("pune");
		l1.add("pune");//we can able to add duplicate data.

		l1.add(1,"pranoti");  //l1.add(index,element);to add data at specific index.

		ArrayList l2=new ArrayList();
		l2.add("Krishna");
		l2.add("Dwarka");
		l2.add(2000);

		l1.addAll(l2);//add one list into another list using addAll() method.
		
		System.out.println(l1);

		Iterator itr = l1.iterator();//we can print arrayList using Iterator interface.
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		l1.set(2,"sanu");  //replace element of specific position.
		System.out.println(l1);
	}	
}