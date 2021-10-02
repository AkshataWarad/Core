class HelmetRunner{
	
	public static void main(String[] Chockies){
		
		Helmet helmet=new Helmet();
		helmet.name="Mike";
		helmet.type=HelmetType.FULLFACE;
		helmet.weight=1405.08f;
		helmet.thick=true;
		helmet.colour="Black";
		
		
		Helmet helmet1=new Helmet();
		helmet1.name="NYC";
		helmet1.type=HelmetType.OPENFACE;
		helmet1.weight=100.08f;
		helmet1.thick=false;
		helmet1.colour="yellow";
		
		
		Helmet helmet2=new Helmet();
		helmet2.name="XYZ";
		helmet2.type=HelmetType.HALFFACE;
		helmet2.weight=130.08f;
		helmet2.thick=true;
		helmet2.colour="white";
		
		
		helmet.Protect();
		
		helmet1.Precaution();
	
		helmet2.Protect();
		
	}
	
}