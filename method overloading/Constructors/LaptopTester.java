class LaptopTester
{
	public static void main(String [] args)
	{
		System.out.println(" main method started...");
	

		//Laptop lp1 = new Laptop();
		//System.out.println(lp1);
		//System.out.println(lp1.model+"/n"+lp1.brand+"/n"+lp1.price);
		//lp.accessInternet();

		//lp.softwareDevelopment();

		
		Laptop lp = new Laptop(" Lenovo" , " L480" , 35000 , 500);
		System.out.println(lp);
		System.out.println(lp.model+"/n"+lp.brand+"/n"+lp.price);
	
		System.out.println("main method ended....");
 	}
}