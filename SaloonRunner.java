class SaloonRunner{
	
	public static void main(String args[])
	{
		
		Saloon sal=new Saloon();
		sal.name= "Loreal Paris";
		sal.location= "Akshaypark";
		sal.opentime= 9.0f;
		sal.closetime= 5.0f;
		sal.branch=SaloonBranch.Akshaypark;
		
		
		
		
		Saloon salo=new Saloon();
		salo.name= "New Style";
		salo.location= "Keshawapur";
		salo.opentime= 9.0f;
		salo.closetime= 10.0f;
		salo.branch=SaloonBranch.keshawapur;
		
		
		sal.haircut();
		salo.haircut();
		
	}
}