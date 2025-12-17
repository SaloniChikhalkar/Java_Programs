//Stack:

import java.util.*;
class StackDemo
{
	public static void main(String args[])
	{
		Stack<Integer> s1 = new Stack<Integer>();
		
		boolean res = s1.empty();

		System.out.println("Is stack is empty :"+res);

		s1.push(11);
		s1.push(17);
		s1.push(15);
		s1.push(4);

		System.out.println("elements in stack : "+s1);

		System.out.println("Current top: "+s1.peek());   //it will represent current top of the stack
		
		s1.pop();
		s1.pop();
		System.out.println("element after pop: "+s1);

		System.out.println("After Pop Current top : "+s1.peek());

		System.out.println("Search Method to Find index Of element: "+s1.search(17));
		
		System.out.println("Search Method to Find index Of element: "+s1.search(77));
	}									//if element not present in stack it returns -1.		
}



