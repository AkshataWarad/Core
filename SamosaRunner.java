class SamosaRunner{
    
	public static void main(String[] args)
	{
	

	
	String[] ing={"Potato","chilli","masala"};
	
	Samosa sam1=new Samosa(15.0f,false,SamosaSize.small,ing);
	
	System.out.println(sam1.cost);
	System.out.println(sam1.taste);
	System.out.println(sam1.size);
	System.out.println(sam1.ingredients);
	
	
	}
}