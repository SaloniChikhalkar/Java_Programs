import java.util.*;
class QueueDemo
{
	public static void main(String args[])
	{
		PriorityQueue<String> q1 = new PriorityQueue<>();

		q1.add("Apple");
		q1.add("Banana");
		q1.add("Grapes");
		q1.add("Cherry");

		q1.offer("Orange");  //adding element using offer() method.

		System.out.println("Queue is : "+q1);

		System.out.println("Head of the Queue: "+q1.peek()); //finding head of the queue using peek() and element() method.

		System.out.println("Head of the Queue: "+q1.element());

		q1.poll();
		System.out.println("After poll method: "+q1);

		q1.remove();
		System.out.println("After remove method : "+q1);
	}
}