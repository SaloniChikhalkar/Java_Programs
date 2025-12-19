//1.capacity(),clone(),size(),indexOf(),remove(),add(),set(),get(),isEmpty(),subList(),toArray()

import java.util.*;
class VectorTest
{
	public static void main(String args[])
	{
		Vector<Integer> v1 = new Vector<>();
	
		v1.add(101);
		v1.add(102);
		v1.add(103);
		v1.add(104);
		v1.add(105);
		v1.add(106);

		System.out.println(v1);

		Vector v2 = (Vector)v1.clone();
		System.out.println("After Clone: "+v2);

		System.out.println("Size of Vector: "+v1.size());
		
		System.out.println("Index of given element: "+v1.indexOf(101));

		System.out.println("Remove Method: "+v1.remove(1));

		System.out.println("Add Element: "+v1.add(107));

		System.out.println("Set element at given index: "+v1.set(0,108));

		System.out.println("Get Element of given index: "+v1.get(2));

		System.out.println("Is Vector empty ?: "+v1.isEmpty());

		System.out.println("Sublist of v1 :"+v1.subList(2,5));
	
		Object[] arr = v1.toArray();

		System.out.println("Convert to Array: "+Arrays.toString(arr));
	}
}
		