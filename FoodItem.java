class FoodItem{
	
	OrderType ordertype;
	Type type;
	String name;
	float price;
	String rating;
	String hotelName;
	int quantity,items;
	static float TotalPrice,TotalFoodItemsPrice;
	String NameAndPrice;
	
	
	void displayDetails(){
		System.out.println("It is of the type :" +type);
		System.out.println("The items are :" +items);
		System.out.println("Number of quantities are :" +quantity);
		System.out.println("The order type is:" +ordertype);
		System.out.println("The ratings are as:" +rating);
		
	}
	void printTotalPrice(){
		
		float total=this.quantity*this.price;
		System.out.println("The cost is :"+ total);
		TotalPrice=TotalPrice + total;
		System.out.println("The total cost is :"+ TotalPrice);
	}
	
	void printTotalFoodItemsPrice(){
		
		float total=this.items*this.price*this.quantity;
		System.out.println("The cost is :"+ total);
		TotalFoodItemsPrice=TotalFoodItemsPrice + total;
		System.out.println("The total cost of food items is :"+ TotalFoodItemsPrice);
		}
	
	void printNameAndPrice(){
			this.name="BabyCorn Manchurian";
			this.price=100.0f;
		System.out.println("The Dish name is "+name+" and its price is "+price);
		}
		
	
		
	
	void printHotelName(){
		System.out.println("The name of the hotel is :" +hotelName);
	}
}