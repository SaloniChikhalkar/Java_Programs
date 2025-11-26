//String buffer: used to make String mutable.
//3 ways to create string buffer:
//1. StringBuffer sb=new StringBuffer(); sb."hello";---its bydefault size id 16byte.
//2.StringBuffer sb= new StringBuffer("Hello");---it create StringBUffer of fixed size of its String length.
//3. StringBuffer sb=new StringBuffer(int capacity);---create the string length given to capacity

/*class MutableString
{
	public static void main(String args[])
	{
		String s1=new String("hello");//immutable String
		s1.concat("krishna");
		System.out.println(s1);

		StringBuilder sb=new StringBuilder("hello");//mutable String
		sb.append(" Krishna");
		System.out.println(sb);
	}
}*/



class MutableString
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());//to check capacity of StrinBuffer ,is 16 or not.
		sb.append("welcome everyone to fortune cloud pimpri"); //it increases the size automatically when it need by formula string length +1*2.
		//if more than that sixe it increases the remaining character count and displays the overall capacity.
		
		System.out.println(sb.capacity());//to check increased capacity.

		StringBuffer sb1=new StringBuffer(10);//we gives the capacity and alse we have a grater stringlength than capacity java use above formula automatically to increase the size.
		sb1.append("hello to fcgt dear all");
		System.out.println(sb1.capacity());
	}
}		