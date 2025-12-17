//vector :

import java.util.*;
class VectorDemo
{
	public static void main(String args[])
	{
		Vector<String> v1 = new Vector<String>();
		
		v1.add("tiago");
		v1.add("tigor");
		v1.add("altroz");
		v1.add("Harrier");
		v1.add("punch");
		v1.add("curve");
		v1.add("Safari");

		//legacy Methods of vector:
		v1.addElement("sierra");

		
		System.out.println("First Element: "+v1.firstElement());

		System.out.println("Last Element : "+v1.lastElement());

		System.out.println("All Elements:"+v1.elements());

		System.out.println("element at given index :"+v1.elementAt(2));

		System.out.println(v1.removeElementAt(3));
	
		System.out.println(v1.removeElement("punch"));	
		

		System.out.println("Vector : "+v1);
	}
}



//1.capacity(),clone(),size(),indexOf(),remove(),add(),set(),get(),isEmpty(),subList(),toArray()