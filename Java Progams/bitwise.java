class bitwise
{
public static void main(String args[])
{
	int a=11;
	int b=17;

	System.out.println("Bitwise AND :"+((a)&(b)));
	System.out.println("Bitwise OR :"+((a)|(b)));
	System.out.println("Bitwise EX-OR :"+((a)^(b)));
	System.out.println("Bitwise NOT :"+(~(b)));

	System.out.println("Right Shift :"+(a>>2));
	System.out.println("Right Shift :"+(b>>1));
	System.out.println("Left Shift :"+(a<<2));
	System.out.println("Left Shift :"+(b<<2));
	System.out.println("Left Shift :"+(10<<1));
	System.out.println("Left Shift :"+(10<<2));
}
}
	