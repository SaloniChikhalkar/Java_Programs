class products
{
	int id;
	String name;
	float price;

	products(int id,String name,float price)
	{
		this.id=id;
  		this.name=name;
		this.price=price;
	}

	public void display()
	{
		System.out.println("product id: "+id+" Product name: "+name+" Product Price: "+price);
	}
}

class ProductData
{
	public static void main(String args[])
	{
		products obj[]= new products[5];
		obj[0]=new products(1,"watch",1000);
		obj[1]=new products(2,"tv",15000);
		obj[2]=new products(3,"mobile",10000);
		obj[3]=new products(4,"laptop",50000);
		obj[4]=new products(5,"tablet",40000);
		
		obj[0].display();
	}
}