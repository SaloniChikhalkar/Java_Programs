import java.util.*;

enum colors{green,pink,blue,saffron,orange}

public class EnumMapTest  
{
	public static void main(String args[])
	{
		
		EnumMap<colors,String>m1 = new EnumMap<colors,String>(colors.class);
		
		m1.put(colors.green,"1");
		m1.put(colors.pink,"2");
		m1.put(colors.blue,"3");
		m1.put(colors.saffron,"4");
		
		System.out.println("name of Colors: "+m1);
		
	}
}