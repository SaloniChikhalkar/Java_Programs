// Map Interface
import java.util.*;
class CollectionMapDemo
{
	public static void main(String args[])
	{
		HashMap m1 = new HashMap();
		m1.put(1,"Ram");
		m1.put(2,"Krishna");
		m1.put(3,"Arjuna");
		m1.put(4,"Mahadeva");

		System.out.println("HashMap : "+m1);
	
		Set s1 = m1.entrySet();

		Iterator itr1 = s1.iterator();

		while(itr1.hasNext())
		{
			Map.Entry entry1 = (Map.Entry)itr1.next();
			System.out.println(entry1.getKey()+" "+entry1.getValue());
		}

		m1.remove(3);
		System.out.println("After remove() HashMap : "+m1);
	
		System.out.println("Set of keys :"+m1.keySet());

		System.out.println("Contains Key : "+m1.containsKey(3));
		System.out.println("COntains Value : "+m1.containsValue("Kishna"));

		System.out.println("Get Key :"+m1.get(4));

		System.out.println("Replace value : "+m1.replace(4,"Bholenath"));


		LinkedHashMap m2 = new LinkedHashMap();
		m2.put(1,"Ram");
		m2.put(2,"Krishna");
		m2.put(3,"Arjuna");
		m2.put(4,"Mahadeva");

		System.out.println("LinkedHashMap : "+m2);
	
		Set s2 = m2.entrySet();

		Iterator itr2 = s2.iterator();

		while(itr2.hasNext())
		{
			Map.Entry entry2 = (Map.Entry)itr2.next();
			System.out.println(entry2.getKey()+" "+entry2.getValue());
		}
		
		m2.remove(2);
		System.out.println("After Remove() LinkedHashMap : "+m2);

		System.out.println("Set of keys :"+m2.keySet());

		System.out.println("Set of keys :"+m2.keySet());

		System.out.println("Contains Key : "+m2.containsKey(3));
		System.out.println("COntains Value : "+m2.containsValue("Kishna"));

		System.out.println("Get Key :"+m2.get(4));
		
		System.out.println("Replace value : "+m2.replace(4,"Bholenath"));



		TreeMap m3 = new TreeMap();
		m3.put(1,"Ram");
		m3.put(2,"Krishna");
		m3.put(3,"Arjuna");
		m3.put(4,"Mahadeva");

		System.out.println("TreeMap : "+m3);
	
		Set s3 = m3.entrySet();

		Iterator itr3 = s3.iterator();

		while(itr3.hasNext())
		{
			Map.Entry entry3 = (Map.Entry)itr3.next();
			System.out.println(entry3.getKey()+" "+entry3.getValue());
		}

		m3.remove(1);
		System.out.println("After remove TreeMap : "+m3);
			
		System.out.println("Set of keys :"+m3.keySet());
		
		System.out.println("Set of keys :"+m3.keySet());

		System.out.println("Contains Key : "+m3.containsKey(3));
		System.out.println("COntains Value : "+m3.containsValue("Kishna"));

		System.out.println("Get Key :"+m3.get(4));

		System.out.println("Replace value : "+m3.replace(4,"Bholenath"));


	}
}