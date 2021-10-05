class IceCream{

String flavour;//literals
Color color;//literals
float temp;
String type;
Brand brand;


IceCream(float temp){
	
	this.temp=temp;
}

IceCream(float temp,String flavour,Color color){
	
	this(temp);
	this.flavour=flavour;
	this.color=color;
	
}

}