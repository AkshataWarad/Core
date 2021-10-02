class Movies{
   
    String name;
    int year;
    float rating;


    Movies(String n,int y){
	   this.name=n;
		this.year=y;	
		System.out.println(name+" "+year);
	}

    
    Movies(float r){
		this.rating=r;	
		System.out.println(rating);
	}	

	void display(){
		System.out.println(name+rating+year);
	}
}