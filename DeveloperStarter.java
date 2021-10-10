class DeveloperStarter{
	
	public static void main(String args[]){
		
		Developer dev=new Developer();
		
	
			String name=dev.getName();
			System.out.println("The developer name is "+name);
			
			dev.setLang("JAVA");
			String lang=dev.getLang();
			System.out.println("The language is "+lang);
			
			dev.setPro(20);
			int pro=dev.getPro();
			System.out.println("The project handles are "+pro);
			
			
			dev.setRole("Team Leader");
			String role=dev.getRole();
			System.out.println("The role of the developer is "+role);
			
			dev.setCompany("Infosys");
			String company=dev.getCompany();
			System.out.println("The name of the Company is "+company);
			
		
	}

}