import java.util.*;

enum colors{green,pink,blue,saffron,orange}
enum days{Sunday,Monday,Tuesday,Wednesday,Thrusday,Friday,Saturday}
enum city{pune,mumbai,nagpur,sangli}
public class EnumSetTest  
{
	public static void main(String args[])
	{
		
		Set<colors>s1 = EnumSet.allOf(colors.class);
		
		System.out.println("name of Colors: "+s1);
		
		Set<days> s2 =EnumSet.of(days.Sunday,days.Wednesday,days.Saturday);
	
		System.out.println("Name of Days: "+s2);

		Set<colors> s3=EnumSet.noneOf(colors.class);
		System.out.println("Name of colors : "+s3);

		List<city> l1 = List.of(city.pune,city.mumbai);
		Set<city> s4 = EnumSet.copyOf(l1);
		System.out.println("elements of s4 : "+s4);
	}
}