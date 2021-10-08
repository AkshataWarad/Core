class SocialMediaAppStarter{
	
	public static void main(String medias[]){
		
		SocialMediaApp soc=new SocialMediaApp();
		soc.setName("Instagram");
		System.out.println(soc.name);
		soc.setSize(3.0f);
		System.out.println(soc.size);
		soc.setLanguage("English");
		System.out.println(soc.language);
		soc.setPlatform("Windows");
		System.out.println(soc.platform);
		soc.setVersion(1.4f);//String version=1.4f;
		System.out.println(soc.version);//System.out.println(version);
		Company1 company1=new Company1();
		soc.setCompany1(company1);//
		company1.name="Facebook";
		System.out.println(soc.company1.name);// or System.out.println(company1.name)
	

	    company1.setFounder("Akshata");
		System.out.println(soc.company1.founder);
		company1.setEst(2000);
		System.out.println(soc.company1.est);
		company1.setNoOEmployees(20);
		System.out.println(soc.company1.noOEmployees);
		company1.setNoOfBranches(4);
		System.out.println(soc.company1.noOfBranches);
		company1.setHeadQuarter("BTM");
		System.out.println(soc.company1.headQuarter);
		company1.setRevenue(82.3f);
		System.out.println(soc.company1.revenue);
		
		
	}
}