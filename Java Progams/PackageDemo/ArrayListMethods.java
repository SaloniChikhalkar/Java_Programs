//get method in collection arraylist.

import java.util.*;

//get() method:

/*class ArrayListMethods
{
	public static void main(String args[])
	{
		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add(20);  //add element into ArrayList.
		l1.add(30);
		l1.add(40);
		l1.add(50);

		System.out.println(l1);
		
		System.out.println("Element of 2nd position: "+l1.get(2));
	}							//get()method to print specific index element.
}*/

//Sort()method:

/*class ArrayListMethods
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

		Collections.sort(l1);  //sort integer Arraylist(asc/desc)using Collection.sort() method.

		System.out.println("Sorted List: "+l1);

		ArrayList<String> l2 = new ArrayList<>();
		l2.add("Saloni");
		l2.add("Pranoti");
		l2.add("Diksha");
		l2.add("pratiksha");
		l2.add("Teju");

		System.out.println("Original List: "+l2);

		Collections.sort(l2);  //sort String Arraylist(asc/desc)using Collection.sort() method.

		System.out.println("Sorted List: "+l2);
	}
}*/

//remove()method:

/*class ArrayListMethods
{
	public static void main(String args[])
	{
		ArrayList<String> l2 = new ArrayList<>();
		l2.add("Saloni");
		l2.add("Pranoti");
		l2.add("Diksha");
		l2.add("pratiksha");
		l2.add("Teju");

		System.out.println("Original List: "+l2);

		l2.remove("Diksha");  //remove element using remove() method.

		System.out.println("Sorted List: "+l2);
	}
}*/

//removeAll():

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

		System.out.println("Original List: "+l1);


		ArrayList l2 = new ArrayList();
		l2.add("Saloni");
		l2.add("Pranoti");
		l2.add("Diksha");
		l2.add("pratiksha");
		l2.add("Teju");

		l1.addAll(l2);

		System.out.println("After adding l2: "+l1);

		l1.removeAll(l2); //removes all new elements[l2] from original list[l1].

		System.out.println("After removing l2: "+l1);
	}

}*/



//indexOf() method :

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

		System.out.println("Original List: "+l1);

		System.out.println("Index of 30 Is : "+l1.indexOf(30));
	}
}*/


//contains() method:

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

		System.out.println("Original List: "+l1);

	   System.out.println("Is element present in list : "+l1.contains(30));
	}								//gives boolean output  if yes[true] or if no[false]
}*/


//clear() method:

class ArrayListMethods
{
	public static void main(String args[])
	{
		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);

		System.out.println("Original List: "+l1);

		l1.clear();  //delete all list and gives empty output

	  	System.out.println("Clear list : "+l1);
	}					
}


/*1.isEmpty() : data available or not(true or false).
2.lastIndexOf(obj) : print index of last element.
3.toArray(obj) : covert arrayList to array.
4.subList() : create sublist for original list.
5.sixe() : size of arrayList.
6.retains():
7.clone();
8.ensureCapacity();
Explain above methods for arraylist in java code example using chatgpt.

















	
		