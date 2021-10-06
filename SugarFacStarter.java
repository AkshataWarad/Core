class SugarFacStarter{
	
	public static void main(String args[]){
		
		SugarFactory sugar=new SugarFactory();
		sugar.capacity=2;
		System.out.println(sugar.capacity);
		
		sugar.machine=new Machine();
		Machine machine=sugar.machine;
		System.out.println(machine.working);
	}
}