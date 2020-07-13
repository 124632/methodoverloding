class  StudentTester {
	public static void main(String[] args) {
		System.out.println(" main method started...");

		Student st=new student();
		st. name ="praveen";
		st. rollnum =1;
		st.gotoInstitute();
		System.out.println("- - - -");

		Student st1 =new Student();
		st1. name ="Arti";
		st1. rollnum =2;

		Bus bs = new Bus();
		bs.transport = "BMTC";
		bs. src = "Majestic";
		bs.dst = "R OPS";

		st1. gotoInstitute(bs);   //st1. gotoInstitute(new Bus());
		st. name ="praveen";
		st. rollnum =1;
		st. gotoInstitute();
		System.out.println("- - - - -");

		Student st1 = new Student();
		st1. name ="Arti";
		st1.rollnum =2;

		Bus bs = new Bus();
		bs. transport = "BMTC";
		bs. src = "Majestic";
		bs. dst = "R OPS";

		st1. gotoInstitute(bs);   //st1. gotoInstitute(new Bus() );
		System.out.println("- - - - - -");

		System.out.println("main method ended..");
            }
}