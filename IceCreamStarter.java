class IceCreamStarter{
	
	public static void main(String args[]){
		
		IceCream cream=new IceCream(-20,"Chocolate",Color.BROWN);
		cream.type="cone";
		System.out.println(cream.temp);
		System.out.println(cream.flavour);
		System.out.println(cream.color);
		System.out.println(cream.type);
		System.out.println(cream.brand);
		cream.brand=new Brand("Akshata","Varsha");
		Brand brand=cream.brand;
		System.out.println(cream.brand);
		brand.since=2013;
		System.out.println(brand.name);
		System.out.println(brand.ownername);
		System.out.println(brand.location);
		System.out.println(brand.since);
	}
		
		
		
		
		
	}
	
       
