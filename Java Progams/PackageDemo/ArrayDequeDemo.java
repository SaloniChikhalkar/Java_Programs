import java.util.*;
class ArrayDequeDemo
{
	public static void main(String args[])
	{
		ArrayDeque<String> dq = new ArrayDeque<>();
		
		dq.add("saloni");
		dq.add("pranoti");
		dq.add("nayana");
		dq.add("minal");
		dq.add("gauri");
		dq.add("diksha");

		System.out.println("Array Deque : "+dq);

		dq.offer("teju");
		System.out.println("After offer method :"+dq);
		
		dq.offerFirst("priya");
		System.out.println("After offerFirst method :"+dq);
		
		dq.offerLast("siddhi");
		System.out.println("After offerLast method :"+dq);

		dq.remove();
		System.out.println("After remove method :"+dq);
								//remove() and poll() methods removes element fron front(head).
		dq.poll();
		System.out.println("After poll method :"+dq);
		
		dq.pollLast();
		System.out.println("After poll method :"+dq);
	}
}