class Laptop
{
	String brand;
	String model;
	double price;
	int hdd;

	Laptop(String br, String ml, double pr, int hd)
                 {
		brand = br;
		model = ml;
		price = pr;
		hdd = hd;
	}

	void SoftwareDevelopment()
	{
		System.out.println("Developing software...");
	}

	void AccessInternet()
	{
		System.out.println(" accessing internet");
	}
}