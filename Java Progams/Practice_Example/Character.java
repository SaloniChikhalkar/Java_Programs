//Check whether a character is alphabet, digit, or special symbol

class Character
{
	public static void main(String args[])
	{
		char ch ='*';

	if((ch>='a' && ch <='z')||(ch>='A' && ch<='Z'))
	{
		System.out.println("character is alphabet");
	}
	else if(ch>='0'&&ch<='9')
	{
		System.out.println("character id digit");
	}
	else
	{
		System.out.println("character is special symbol");
	}
	}
}