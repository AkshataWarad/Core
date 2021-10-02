class NailCutterRunner{

     public static void main(String[] Cookies){
		 
		 NailCutter Nail=new NailCutter();
		 Nail.name= "VEGA";
		 Nail.sharpness = true;
		 Nail.rate= 60.0f;
		 Nail.material= "Steel";
		 Nail.size= NailCutterSize.SMALL;
		 
		 
		 NailCutter Nail1=new NailCutter();
		 Nail1.name= "Scholl";
		 Nail1.sharpness = false;
		 Nail1.rate= 40.0f;
		 Nail1.material= "Steel";
		 Nail1.size= NailCutterSize.MEDIUM;
		 
		 
		 NailCutter Nail2=new NailCutter();
		 Nail2.name= "Truvic";
		 Nail2.sharpness = true;
		 Nail2.rate= 100.0f;
		 Nail2.material= "Steel";
		 Nail2.size= NailCutterSize.BIG;
		 
		 Nail.Nailcut();
		 Nail1.Shaper();
		 Nail2.Nailcut();
		 
		 
	 }
}