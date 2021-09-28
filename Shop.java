class Shop
{
	public Shop()
	{
		System.out.println("Default constructor");
	}

	Shop(String name1)
	{
		this(5);
		System.out.println("first constructor"+name1);
	}
    
	Shop(int name2)
	{
		this();
		System.out.println("Second constructor"+name2);
	}
	
	public static void main(String args[])
	{
		Shop shop=new Shop("Akshu");
		Shop shop1=new Shop(90);
		
	}
}