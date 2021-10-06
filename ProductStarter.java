class ProductStarter{
	
	public static void main(String args[]){
		
		Product pro=new Product();
		pro.name="VEGA";
		pro.type="Appliances";
		pro.price=98.2f;
		pro.quantity="100gms";
		pro.DisplayDetails();
		
		
		pro.vendor=new Vendor();
		Vendor ven=pro.vendor;
		System.out.println(pro.vendor);
		System.out.println();
		ven.name="Akshu";
		ven.quality=true;
		ven.location="BLR";
		ven.DisplayDetails();
	}
}