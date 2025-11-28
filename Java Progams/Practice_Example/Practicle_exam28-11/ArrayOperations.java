
/*PROBLEM 2: ARRAY OPERATIONS MENU 
(Loops + Arrays + Exception Handling) 
Problem Statement: 
Write a Java program that performs operations on an integer array using a menu-driven loop. 
Program requirements: 
1. Accept the size of the array. 
o If size ≤ 0, throw and handle an exception. 
2. Accept array elements from the user. 
3. Display the following menu until the user chooses Exit: 
1. Display all elements 
2. Find the largest element 
3. Calculate sum of elements 
4. Search for an element (Linear Search) 
5. Exit 
4. Perform the selected operation and display the result. 
5. Handle invalid menu choices. 
Sample Input: 
Enter size of array: 5 
Enter 5 elements: 10 25 5 18 30 
Menu: 
1. Display 
2. Max 
3. Sum 
4. Search 
5. Exit 
Enter choice: 2 
Sample Output: 
Largest element: 30 
Another Sample Search Input: 
Enter choice: 4 
Enter element to search: 18 ?*/



class InvalidSizeException extends Exception {
    public InvalidSizeException(String msg) {
        super(msg);
    }
}

public class ArrayOperations {

    public static void main(String[] args)
	{
           try {
             int size = 5;
		System.out.print("Enter size of array: "+size);

            if (size <= 0) {
                throw new InvalidSizeException("Array size must be greater than 0.");
            }

            int[] arr = {2,5,10,3,11};
		for (int i = 0; i < arr.length; i++) 
		{
   			 System.out.print("Array Elements: "+arr[i]);
		}
             
          

            int choice;
         
                System.out.println("\nMenu:");
                System.out.println("1. Display");
                System.out.println("2. Find Max");
                System.out.println("3. Calculate sum");
                System.out.println("4. Search element");
                System.out.println("5. Exit");
		
		choice = 3;
                System.out.print("Enter choice: "+choice);
                
		 System.out.print(" ");
                switch (choice) {
                    case 1:
                        System.out.println("Array elements:");
                        for (int i = 0; i < size; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                        break;

                    case 2:
                        int max = arr[0];
                        for (int i = 1; i < size; i++) {
                            if (arr[i] > max) {
                                max = arr[i];
                            }
                        }
                        System.out.println("Largest element: " + max);
                        break;

                    case 3:
                        int sum = 0;
                        for (int i = 0; i < size; i++) {
                            sum += arr[i];
                        }
                        System.out.println("Sum of elements: " + sum);
                        break;

                    case 4:
                        System.out.print("Enter element to search: ");
                        int key = 5;
                        boolean found = false;

                        for (int i = 0; i < size; i++) {
                            if (arr[i] == key) {
                                found = true;
                                break;
                            }
                        }

                        if (found)
                            System.out.println(key + " found in the array.");
                        else
                            System.out.println(key + " not found.");
                        break;

                    case 5:
                        System.out.println("Exiting program...");
                        break;

                    default:
                        System.out.println("Invalid choice! Please enter 1–5.");
                }

           } 
	catch (InvalidSizeException e) 
	{
            System.out.println("Error: " + e.getMessage());
        }
    }
}




