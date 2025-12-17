//get method in collection arraylist.

import java.util.*;
/*class ArrayListMethods
{
	public static void main(String args[])
	{
		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);

		System.out.println(l1);
		
		System.out.println("Element of 2nd position: "+l1.get(2));
	}							//get()method to print specific index element.
}*/


class ArrayListMethods
{
	public static void main(String args[])
	{
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);

		System.out.println("Original List: "+l1);

		Collections.sort(l1);  //sort list(asc/desc)using Collection.sort() method.

		System.out.println("Sorted List: "+l1);

		ArrayList<String> l2 = new ArrayList<>();
		l2.add("Saloni");
		l2.add("Pranoti");
		l2.add("Diksha");
		l2.add("pratiksha");
		l2.add("Teju");

		System.out.println("Original List: "+l2);

		Collections.sort(l2);  //sort list(asc/desc)using Collection.sort() method.

		System.out.println("Sorted List: "+l2);
	}
}
		
		