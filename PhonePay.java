class PhonePay{
	
	String company;
	float version;
	String architect;
	boolean working;
	
	
	void setCompany(String company){
	this.company=company;
	System.out.println("Invoked the setter Company");
	}
	
	void setVersion(float version){
	this.version=version;
	System.out.println("Invoked the setter version ");
	}
	
	void setArchitect(String architect){
	this.architect=architect;
	System.out.println("Invoked the setter architect");
	}
	
	void setWorking(boolean working){
	this.working=working;
	System.out.println("Invoked the setter working ");
	}
	
	
}