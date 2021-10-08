class MiPhoneStarter{
	
	public static void main(String args[]){
		
		
		
		MiPhone mi=new MiPhone();
		mi.setBrand("Chinese");
		System.out.println(mi.brand);
		mi.setPrice(15500.00f);
		System.out.println(mi.price);
		mi.setColor("Aqua Green");
		System.out.println(mi.color);
		mi.setImei(1800);
		System.out.println(mi.imei);
		PhonePay phonepay=new PhonePay();
		mi.setPhonePay(phonepay);
		System.out.println(mi.phonepay);
		
		phonepay.setCompany("Chinese");
		System.out.println(mi.phonepay.company);
		phonepay.setVersion(237.06f);
	    System.out.println(mi.phonepay.version);
		phonepay.setArchitect("Akshata");
	    System.out.println(mi.phonepay.architect);
		phonepay.setWorking(true);
		System.out.println(mi.phonepay.working);
		
		
	}

}