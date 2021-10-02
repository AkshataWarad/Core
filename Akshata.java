class Akshata{
	
	
      int age;
	  String colour;
	  int number;
	  
	  
	  Akshata(int a){
		  int age=a;
		  System.out.println(age);
	  }
	  
	  
	  Akshata(String b,int c){
		   this(21);
		  String colour=b;
		  int number=c;
		  System.out.println(colour+"  "+number);
		 
	  }
	  
	  
    public static void main(String args[]){
		
		Akshata x=new Akshata("Black",3);
	}
}