import java.util.*;
class CollectionSetDemo
{
	public static void main(String args[])
	{
		HashSet<Integer> hs = new HashSet<>();
		hs.add(11);
		hs.add(12);
		hs.add(114);
		hs.add(17);
		hs.add(15);
		hs.add(16);
		hs.add(1);
		hs.add(6);
		hs.add(10);
		hs.add(null);

		System.out.println("HashSet :"+hs); //represents the output as ramdom.


		LinkedHashSet<Integer> hs1 = new LinkedHashSet<>();
		hs1.add(11);
		hs1.add(12);
		hs1.add(114);
		hs1.add(17);
		hs1.add(15);
		hs1.add(16);
		hs1.add(1);
		hs1.add(6);
		hs1.add(10);
		hs1.add(null);

		System.out.println("LinkedHashSet :"+hs1);//reperents the output as insertion order.


		TreeSet<Integer> hs2 = new TreeSet<>();
		hs2.add(11);
		hs2.add(12);
		hs2.add(114);
		hs2.add(17);
		hs2.add(15);
		hs2.add(16);
		hs2.add(1);
		hs2.add(6);
		hs2.add(10);
	      //hs2.add(null); TreeSet does not allow empty(null) value to store.

		System.out.println("TreeSet :"+hs2);//represent the output in ascending order.
	}
}

//add(),clear(),clone(),contains(element),isEmpty(),remove(),size()

























