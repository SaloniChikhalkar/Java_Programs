/*Q19. Demonstrate Member Inner Class
Class Laptop
Inner class Processor
Print processor details.
*/



class Laptop
{
	class Proccessor
	{
		String brand="Intel";
		int core=4;

		void showDetails()
		{		
			System.out.println("Brand of Laptop: "+brand);
			System.out.println("Cores : "+core);
		}
	}
	public static void main(String args[])
	{
		Laptop l = new Laptop();
		Laptop.Proccessor lp = l new.Proccessor();
		lp.showDetails();
	}
}
