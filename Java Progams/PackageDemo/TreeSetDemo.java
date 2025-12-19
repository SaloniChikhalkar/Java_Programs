import java.util.*;
class TreeSetDemo
{
	public static void main(String args[])
	{
		TreeSet<Integer> t1 =new TreeSet<>();
		
		t1.add(12);
		t1.add(13);
		t1.add(121);
		t1.add(102);
		t1.add(212);
		t1.add(152);
		t1.add(192);
	
		System.out.println("TreeSet : "+t1);

		t1.pollFirst();
		t1.pollLast();
		System.out.println("After poll methods: "+t1);
		
		System.out.println("Descending Set : "+t1.descendingSet()); //treeSet gives us descendingSet() method to display descending order of data.

		System.out.println("HeadSet Method : "+t1.headSet(121,true));//prints data before 121.
		
		System.out.println("TailSet Method : "+t1.tailSet(121,true)); //prints data after 121.

		System.out.println("SubSet Method : "+t1.subSet(13,true,152,true)); //prints 13 to 152 

		System.out.println("Lower Method : "+t1.lower(102)); //closest lower of 102.

		System.out.println("Higher Method : "+t1.higher(102)); //closest higher of 102.

		
	}
}