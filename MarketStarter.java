class MarketStarter{

     public static void main(String args[]){
		 
		 Market market=new Market();
		 market.noOfShops=12;
		 market.name="DurgadBail";
		 market.city="HUBLI";
		 market.displayDetails();
		 
	 

	  Market market1=new Market();
	  market1.noOfShops=13;
	  market1.name="Kamripet";
	  
	  market1.displayDay();
	  market.displayDetails();
}
}