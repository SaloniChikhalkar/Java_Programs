//String token:
import java.util.*;
class StringToken
{
	public static void main(String args[])
	{
		String s1 = "Have,a,nice,day..";//separator is comma(,)
		StringTokenizer st = new StringTokenizer(s1);

		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken(","));
		}
	}
}