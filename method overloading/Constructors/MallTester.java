class Tester
{
	public static void main(String [] args){
		System.out.println("main method started...");

	ShoppingMall sm = new ShoppingMall();
	sm.name = "orian";
	sm.rentprice = 100000;
	System.out.println(" - - - - - -");

	Car c =new Car();
	c.brand= " Hyundai";
	c.model=" Verna";
	c.price=130000;
	c.cc= 2000;
	c.color= "Black";
	c. getCarDetails();
	System.out.println("  - - -- - - ");

	Car c1 = new Car(" Hyundai", "Verna", " Black");
	c1. getCarDetails();
	System.out.println(" main method ended...");
	}
}
	