//String Methods: 
//1. concat(): it allows you to concat 2 strings.
//2. length(): it allows to find out the length of string.
//3. charAt(): it will return character at specific index.
//4. substring() : it will returs which you want in the string.
//5. equals(): compares two strings
//6. toLowerCase: converts uppercase to lowercase
//7. toUpperCase: converts lowercase to uppercase
//8. String.join():methos will join the group of string together as per specified separator.
//separators = (- , : :: /  )
//9. contains(): it will check weather string present in the given string(if yes-- true,if no--false)
//10.trim(): it removes additional spaces in the string.
//11.replace(old char,new char): replace the old char by new  character.



class StringMethods
{
	public static void main(String args[])
	{
		String s1="saloni";
		String s2="Chikhalkar";
		s1.concat(s2);//using concat function
		String s3=s1+s2; //using +operator

		System.out.println(s1.concat(s2));//concat
		System.out.println(s3);

		System.out.println("length of String: "+s3.length());//Length

		System.out.println("Character At: "+s3.charAt(5));//charAt

		System.out.println("SubString : "+s3.substring(0,6));//substring

		System.out.println("SubString : "+s3.substring(6));//consider as a strating index and return data till end of the string.

		String s5="fct";
		String s6="FCT";
		String s7=new String("fct");
		
		System.out.println(s5.equals(s6)); //equals(): compares both literals
		System.out.println(s5.equals(s7)); //compares string literal and object

		String s9="SALONI";
		String s8="chikhalkar";

		System.out.println(s9.toLowerCase()); //toLowerCase()
		System.out.println(s8.toUpperCase()); //toUpperCase()

		String s10;
		s10=String.join("-","Saloni" , "Shivaji" , "Chikhalkar");
		System.out.println(s10);
		
		String s11="awsome";

		System.out.println(s11.contains("some"));// contains() true
		System.out.println(s11.contains("ase")); //false

		String s12="     coding is       ";
		System.out.println("without trim: "+s12);
		System.out.println("with trim: "+s12.trim()+" awsome");//trim()

		String s13="cat";
		System.out.println(s13.replace('t','p'));//replace
	}



}