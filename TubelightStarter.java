class TubelightStarter{
	
	public static void main(String args[]){
		
		TubeLight light=new TubeLight();
	
		String memory=light.getName();
		System.out.println("Tubelight is " +memory);
		
		
		light.setWatts(20);
		int watts=light.getWatts();
		System.out.println("Tubelight watts is "+watts);
	}
}