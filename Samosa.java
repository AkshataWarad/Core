class Samosa{
	float cost;
    boolean taste;
    SamosaSize size;
    String[] ingredients;

Samosa(float cost,boolean taste)
{
	System.out.println("created using float,boolean");
	this.cost=cost;
	this.taste=taste;
}	

Samosa(float cost,SamosaSize size,String[] ingredients)
{
	System.out.println("Created using size and ingredients");
	this.size=size;
	this.ingredients=ingredients;
}

Samosa(float cost,boolean taste,SamosaSize size,String[] ingredients)
{
    this(cost,size,ingredients);
    
    this.taste=taste;
    System.out.println("Created using all the datatypes");	
}

}