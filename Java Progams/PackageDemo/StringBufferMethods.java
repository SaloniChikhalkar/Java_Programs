//StringBuffer and Builder Methods:difference is thread safe and non-thread safe respectively.
//1.append(): concat 2strings
//capacity():give capacity(length) to the string
//Length():allow to finf length
//reverse():allow to make string reverse.
//5.charAt(index):display the character at specific index.
//6.setCharAt():add the character at specific index.
//7.deleteChat():delete the character at specific index.



class StringBufferMethods
{
	public static void  main(String args[])
	{
		StringBuffer sb=new StringBuffer(10);
		
		sb.append("hello welcome to fct dear all");
		System.out.println(" ");

		System.out.println("Length of string: "+sb.length());
		System.out.println(" ");

		System.out.println("Reverse the String: "+sb.reverse());
		System.out.println(" ");

		System.out.println("Print character at Specific index : "+sb.reverse());
		System.out.println(" ");

		System.out.println("Add the character at specific index 5: "+sb);
		System.out.println(" ");

		System.out.println("Delete charcter at specific index 3: "+sb.deleteCharAt(3));
		System.out.println(" ");

		System.out.println("index of specific character f: "+sb.indexOf("f"));
		System.out.println(" ");

		System.out.println("Is Empty String: "+sb.isEmpty());
		System.out.println(" ");

		System.out.println("subString : "+sb.substring(5,13));
		System.out.println(" ");

		System.out.println("String class: "+sb.getClass());

		System.out.println(" ");
	}
}