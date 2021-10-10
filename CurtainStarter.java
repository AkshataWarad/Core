class CurtainStarter{
	
	
	public static void main(String args[]){
		
		Curtain curtain=new Curtain();
		String color=curtain.getColor();
		System.out.println("The color of curtain is "+color);
		
		curtain.setQuality(true);
		boolean quality=curtain.getQuality();
		System.out.println("The quality of curtain is "+quality);
		
		curtain.setType(ClothType.VELVET);
		ClothType type=curtain.getType();
		System.out.println("The clothtype of curtain is "+type);
		
		curtain.setPrice(1500.00f);
		float price=curtain.getPrice();
		System.out.println("The price of the curtain is "+price);
		
		String rating=curtain.getRating();
		System.out.println("The rating of the curtain is "+rating);
	}
}