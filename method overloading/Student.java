class Student {
	String name;
	int rollnum;


	void gotoIstitute() {
		System.out.println(" going by wallk...");
	}
	void gotoInstitute(Bike bk) {
		System.out.println(" using Bike...");
		System.out.println(" Bike details are");
		System.out.println(bk . brand+ "\n" +bk.color +"\n" +bk.price);
	}

	void gotoInstitute(Bus bs) {
		System.out.println(" using bus..");
		System.out.println("Bus details are");
		System.out.println("bs. transporter+ "\n" +bs.src+ "\n" +bs.dst);
	}
}	