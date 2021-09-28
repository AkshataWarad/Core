class Person{
 
    String study="Boring";
	
	void study()
	{
    System.out.println("Invoked Study");
	System.out.println(study);
	this.eat();
	} 
	
	static void eat()
	{
    System.out.println("Invoked eat");
	play();
	} 
	
	static void play()
	{
    System.out.println("Invoked play");
	} 
	
	
}