class FoodItemStarter{
	
	
	public static void main(String args[]){
		
		FoodItem food=new FoodItem();
		food.hotelName="PANJURLI";
		food.printHotelName();
		System.out.println("These are the details of the Food Items");
		food.items=2;
		food.rating="5 Star";
		food.ordertype=OrderType.TAKEAWAY;
		food.price=100.0f;
		food.printNameAndPrice();
		food.quantity=5;
		food.type=Type.CHINESE;
		food.displayDetails();
		food.printTotalPrice();
		food.printTotalFoodItemsPrice();
		
		
		
		
		
	    
		}
		
		
}