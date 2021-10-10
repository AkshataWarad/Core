class ContractorStarter{
	
	
	public static void main(String args[]){
		
		Contractor contract=new Contractor();
		String name=contract.getName();
		System.out.println("The name of the contractor is "+name);
		
		contract.setWorking(true);
		boolean working=contract.getWorking();
		System.out.println("The working of the contractor is "+working);
		
		contract.setPlant("Thermal Power plant");
		String plant=contract.getPlant();
		System.out.println("It is of "+plant);
		
		contract.setSite("BTM");
		String site=contract.getSite();
		System.out.println("The site is in "+site);
		
		contract.setType1(Type1.GENERALCONTRACTORS);
		Type1 type=contract.getType1();
		System.out.println("It is of the type "+type);
	}

}