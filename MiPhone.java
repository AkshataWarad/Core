class MiPhone{
	
	String brand;
	float price;
	String color;
	int imei;
	PhonePay phonepay;
	
	
	void setBrand(String brand){
	this.brand=brand;
	System.out.println("Invoked the setter Brand");
	}
	
	void setPrice(float price){
	this.price=price;
	System.out.println("Invoked the setter Price");
	}
	
	void setColor(String color){
	this.color=color;;
	System.out.println("Invoked the setter Color");
	}
	
	void setImei(int imei){
	this.imei=imei;
	System.out.println("Invoked the setter imei");
	}
	
	void setPhonePay(PhonePay phonepay){
	this.phonepay=phonepay;
	System.out.println("Invoked the setter phonepay");
	}
}