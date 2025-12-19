//add(),clear(),clone(),contains(element),isEmpty(),remove(),size()

import java.util.*;
class CollectionSetMethods
{
	public static void main(String args[])
	{
		HashSet<Integer> hs = new HashSet<>();
		hs.add(11);
		hs.add(12);
		hs.add(114);
		hs.add(17);
		System.out.println("HashSet :"+hs); 
		HashSet<Integer> hscopy = (HashSet) hs.clone();
		System.out.println("Copy :"+hscopy);

		System.out.println("COntains :"+hs.contains(12));

		System.out.println("Set is empty? : "+hs.isEmpty());
		
		System.out.println("Size of Set : "+hs.size());

		System.out.println("Remove Element : "+hs.remove(114));

		hs.clear();

		System.out.println("Clear Set  ");
	
		
		LinkedHashSet<Integer> hs1 = new LinkedHashSet<>();
		hs1.add(11);
		hs1.add(12);
		hs1.add(114);
		hs1.add(17);
		hs1.add(15);
		

		System.out.println("LinkedHashSet :"+hs1);//reperents the output as insertion order.
		
		

		LinkedHashSet<Integer> lhscopy = (LinkedHashSet) hs1.clone();
		System.out.println("Copy :"+lhscopy);

		System.out.println("COntains :"+hs1.contains(12));

		System.out.println("Set is empty? : "+hs1.isEmpty());
		
		System.out.println("Size of Set : "+hs1.size());

		System.out.println("Remove Element : "+hs1.remove(114));


		hs1.clear();

		System.out.println("Clear Set  ");
	


		TreeSet<Integer> hs2 = new TreeSet<>();
		hs2.add(11);
		hs2.add(12);
		hs2.add(114);
		hs2.add(17);
		hs2.add(15);

		System.out.println("TreeSet :"+hs2);

		TreeSet<Integer> tscopy = (TreeSet) hs2.clone();
		System.out.println("Copy :"+tscopy);

		System.out.println("COntains :"+hs2.contains(12));

		System.out.println("Set is empty? : "+hs2.isEmpty());
		
		System.out.println("Size of Set : "+hs2.size());

		System.out.println("Remove Element : "+hs2.remove(114));

		hs2.clear();

		System.out.println("Clear Set  ");
	
	}
}
		