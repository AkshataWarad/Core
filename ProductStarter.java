class ProductStarter{
	
	public static void main(String args[]){
		
		Product product=new Product("Hair Dryer","EC",50.0f,2,"Philips");
		product.displayDetails();
		
		Product product1=new Product("Straightner",150.0f,5);
		product1.displayDetails();
		product.printTotalCost();
		product1.printTotalCost();
		
	}
}