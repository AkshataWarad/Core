class Contractor{
	
	private String name="Soubhagya";
	private boolean working;
	private String plant;
	private String site;
	private Type1 type1;
	
	String getName(){
		return this.name;
	}
	
	void setWorking(boolean working){
		this.working=working;
	}
	
	boolean getWorking(){
		return this.working;
	}
	
	void setPlant(String plant){
		this.plant=plant;
	}
	
	String getPlant(){
		return this.plant;
	}
	
	void setSite(String site){
		this.site=site;
	}
	
	String getSite(){
		return this.site;
	}
	
	void setType1(Type1 type1){
		this.type1=type1;
	} 
	
	Type1 getType1(){
		return this.type1;
	}
	
	
	
}