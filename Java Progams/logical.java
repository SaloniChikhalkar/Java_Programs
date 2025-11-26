class logical
{
public static void main(String args[])
{
	int a=11;
	int b=17;
	
	System.out.println("Logical AND :"+((a<b)&&(a>b)));
	System.out.println("Logical OR :"+((a>b)||(a<b)));
	System.out.println("Logical NOT :"+(!(a==b)));
}
}