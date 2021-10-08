class FSTStarter{
	
     public static void main(String args[]){
		 
		 
		 Forest forest=new Forest("Chamrajanagar",true);
		 System.out.println(forest.name);
		 System.out.println(forest.location);
		 System.out.println(forest.reserved);
		 System.out.println(forest.state);
		 
		 forest.state=new State("Karnataka","Basavraj Bommai");//State state=new State();
		 State state=forest.state;//
		 System.out.println(forest.state);

		 System.out.println();
		 System.out.println(state.name);
		 System.out.println(state.cmName);
		 System.out.println(state.noOfDistricts);
		 System.out.println(state.capitalcity);
		 
		 state.capitalcity=new CapitalCity("BLR","IT");
		 CapitalCity cap=state.capitalcity;
		  System.out.println(state.capitalcity);
		   System.out.println();
		 System.out.println(cap.name);
		 System.out.println(cap.population);
		 System.out.println(cap.famousFor);
		 
	 }
}