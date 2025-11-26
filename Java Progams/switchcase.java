class switchcase
{
public static void main(String args[])
{
	char choice;//any kind of data we can take as a chice like int,char,string.
	System.out.println("a.Cricket");
	System.out.println("b.Football");
	System.out.println("c.Volleyball");
	System.out.println("d.Rugby");
	System.out.println("e.Polo");
	System.out.println("f.Kabaddi");

	//enter your choice.
	choice='e';

    switch(choice)
    {
	case 'a':
	System.out.println("my favourite sport is Cricket");
	//break;

	case 'b':
	System.out.println("my favourite sport is Football");
	//break;

	case 'c':
	System.out.println("my favourite sport is Volleyball");
	//break;

	case 'd':
	System.out.println("my favourite sport is Rugby");
	//break;

	case 'e':
	System.out.println("my favourite sport is Polo");
	//break;

	case 'f':
	System.out.println("my favourite sport is Kabaddi");
	break;

	default:
	System.out.println("invalid Sport");
	break;

    }
}
}

	