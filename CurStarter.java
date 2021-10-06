class CurStarter{
	
	
	public static void main(String args[]){
		
		Currency currency=new Currency();
		currency.value="0.013USD";
		System.out.println("Details of Currency");
		System.out.println(currency.name);
		currency.displayDetails();
		currency.country=new Country();
		Country country=currency.country;
		System.out.println(currency.country);
		System.out.println();
		
		System.out.println("Details of Country");
		country.name="INDIA";
		System.out.println(country.name);
		System.out.println(country.code);
		
		Company company=new Company();
		company.CFO="Sou";
		System.out.println();
		System.out.println("Details of Company");
		System.out.println(company.name);
		System.out.println(company.CEO);
		company.displayDetails();
		company.country=new Country();
		System.out.println(company.country);
		
		Application app=new Application();
		app.version=2.3f;
		System.out.println();
		System.out.println("Details of Application");
		System.out.println(app.name);
		System.out.println(app.version);
		app.company=new Company();
		System.out.println(app.company);
		
		
		
		
	}
}