//2.wap to print electricity bill 100>low 100-200 >medium 200>high//

class nestedifelseelectricity
{
public static void main(String args[])
{

	int unit=150;

	if(unit<100)
	{
	System.out.println("we use low Electricity");
	}
	else if((unit>100)&&(unit<200))
	{
	System.out.println("we use medium Electricity");
	}
	else
	{
	System.out.println("We use high Electricity");
	}
}
}