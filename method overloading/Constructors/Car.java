class Car
{
	String brand;
	String model;
	double price;
	String color;
	String airBags;
	int cc;

	Car()
	{
		System.out.println(" Car default constructor...");
	}

	Car(String brand, String model, String color)
	{
		this();
		System.out.println(" 3param Car constructor..");
		this.brand =brand;
		this.model =model;
		this.color =color;
	}
	
	Car(String brand, String model, String color, String airBag){
		this(brand,model,color);
		//this(); - -> can not be second statment
		
	 	System.out.println(" 4param Car constructor..");
		
		this.airBags = airBag;
}

	void getCarDetails()
	{
		System.out.println(this.brand+"\n"+this.model+"\n"+this.price+"\n"+this.color+"\n"+this.cc);
	}
}