//linkedList :

import java.util.*;
class LikedListDemo
{
	public static void main(String args[])
	{
		LinkedList<String> l1 = new LinkedList<>();
		
		//add() methods:
		l1.add("Saloni");
		l1.add("Diksha");
		l1.add("Nayana");
		l1.add("Gauri");
		l1.add("Minal");
		l1.addLast("Pranoti");  //add() and addLast() add elements at the last position in linkedList.
		l1.addFirst("Sanika");
		l1.push("Teju");       //push() and addFirst() add elements at the first position in LinkedList.

		//get() Mathods:
		System.out.println("Element at 5th position: "+l1.get(5));  // retrives element at given index.
		System.out.println("First Element : "+l1.getFirst());      //retrive first element.
		System.out.println("Last Element : "+l1.getLast());       //retrives last element.
		
		//peek(): same as get()method but if list is empty it returns null value.
		System.out.println("Element usinf only peek() method: "+l1.peek());  // retrives first element.
		System.out.println("First Element : "+l1.peekFirst());     //retrive first element.
		System.out.println("Last Element : "+l1.peekLast());      //retrives last element.

		System.out.println("LikedList : "+l1);
	}
}


/*1.remove() and poll()  : it removes first element
2.remove(index) : remove element at specific index
3.removeFirst() amd  pollFirst() : remove first element
4.reoveLast() and pollLast() : remove last element
5.contains(),6.offer(),7.offerFirst(),8.offerLast(),9.clone().*/