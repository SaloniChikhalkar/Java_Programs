/*1.isEmpty() : data available or not(true or false).
2.lastIndexOf(obj) : print index of last element.
3.toArray(obj) : covert arrayList to array.
4.subList() : create sublist for original list.
5.size() : size of arrayList.
6.retains():
7.clone();
8.ensureCapacity();
Explain above methods for arraylist in java code example using chatgpt.*/

import java.util.*;
class ArrayListMethodsTest
{
	public static void main(String args[])
	{
		ArrayList a1 = new ArrayList();

		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);

		System.out.println("ArrayList : "+a1);


		System.out.println("Is Empty Method: "+a1.isEmpty());

		System.out.println("index of given element: "+a1.lastIndexOf(50));

		System.out.println("Convert to Array: "+Arrays.toString(a1.toArray()));

		List sub = a1.subList(2,5);
		System.out.println("Sublist: "+sub);

		System.out.println("Size of list : "+a1.size());

		ArrayList a2 = new ArrayList();
		a2.add(20);
		a2.add(40);
		a2.add(80);

		a1.retainAll(a2);
		System.out.println("After retainAll(): " + a1);

		
		ArrayList cl = (ArrayList) a1.clone();
		System.out.println("Cloned ArrayList: " + cl);

		
		a1.ensureCapacity(20);
		System.out.println("ensureCapacity() called successfully");
	}
}


