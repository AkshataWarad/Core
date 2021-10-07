class Product{

String name;
String type;
float price;
int quantity;
String vendor;
static float totalProductsPrice;
//no of paramters
//order sequence
//change in datatype
Product(String name,String type,float price,int quantity,String vendor){
	
	this.name=name;
	this.type=type;
	this.price=price;
	this.quantity=quantity;
	this.vendor=vendor;
	System.out.println("Invoked 5 parameters");
}

Product(String name,float price,int quantity){
	
	this.name=name;
	this.price=price;
	this.quantity=quantity;
	System.out.println("Invoked 3 parameters");
}
 
 void displayDetails()
 {
	 System.out.println("Display method is invoked");
	 System.out.println(this.name);
	 System.out.println(this.type);
	 System.out.println(this.price);
	 System.out.println(this.quantity);
	 System.out.println(this.vendor);
	 }
	 
	 void printTotalCost(){
		 
		 float total=this.quantity*this.price;
		 System.out.println("This is the cost :"+total);
		totalProductsPrice= totalProductsPrice + total;
		 System.out.println("This is the total cost :" +totalProductsPrice);
	 }
}
