class SocialMediaApp{
	
	String name;
	float size;
	String language;
	String platform;
	float version;
	Company1 company1;
	
     void setName(String name){
		 this.name=name;
		 System.out.println("Invoked Setter name");
	 } 
	     void setSize(float size){
		 this.size=size;
		 System.out.println("Invoked Setter size");
	}
	    void setLanguage(String language){
		 this.language=language;
		 System.out.println("Invoked Setter Language");
		}
		 void setPlatform(String platform){
		 this.platform=platform;
		 System.out.println("Invoked Setter platform");
		}
		 void setVersion(float version){
		 this.version=version;
		 System.out.println("Invoked Setter Version");
		}
		void setCompany1(Company1 company1){
		 this.company1=company1;
		 System.out.println("Invoked Setter Company");
		}
	
}