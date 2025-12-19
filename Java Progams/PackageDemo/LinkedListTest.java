
/*1.remove() and poll()  : it removes first element
2.remove(index) : remove element at specific index
3.removeFirst() amd  pollFirst() : remove first element
4.reoveLast() and pollLast() : remove last element
5.contains(),6.offer(),7.offerFirst(),8.offerLast(),9.clone().*/

import java.util.*;
class LinkedListTest
{
	public static void main(String args[])
	{
		LinkedList l1 = new LinkedList();
				l1.add("pune");
		l1.add("Mumbai");
		l1.add("Nashik");
		l1.add("sangli");
		l1.add("Kolhapur");
		System.out.println("LikedList : "+l1);

		System.out.println("Element at 5th position: "+l1.get(3));  
		System.out.println("First Element : "+l1.getFirst());      
		System.out.println("Last Element : "+l1.getLast());       
		
		
		System.out.println("Element usinf only peek() method: "+l1.peek());  
		System.out.println("First Element : "+l1.peekFirst());    
		System.out.println("Last Element : "+l1.peekLast()); 

		System.out.println("Remove Method: "+l1.remove());

		System.out.println("Remove Element of given index: "+l1.remove(3));

		System.out.println("Remove First Element: "+l1.removeFirst());

		System.out.println("Remove Last Element: "+l1.removeLast());

		System.out.println("Remove Element of given index: "+l1.poll());

		System.out.println("Remove First Element: "+l1.pollFirst());

		System.out.println("Remove Last Element: "+l1.pollLast());

		System.out.println("Element contains in list: "+l1.contains("Mumbai"));

		LinkedList l2 = new LinkedList();
		l2.offer("pimpri");
		l2.offer("Mandai");
		l2.offer("satara");
		System.out.println("Second LinkedList: "+l2);

		System.out.println("Add First Element : "+l1.offerFirst("Ishwarpur"));    
		System.out.println("Add Last Element : "+l1.offerLast("chinchwad")); 
		
		LinkedList l3 = (LinkedList)l1.clone();
		System.out.println("Clone :"+l3);

		
	}
}


		    

		