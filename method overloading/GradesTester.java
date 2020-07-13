class GradesTester
{
  	public static void main(String[] args)
       {
	System.out.println(" main method started....");
	Grades gr = new Grades();
	
	double Per =gr. getPercentage( 30, 49, 60, 70);
	System.out.println(" Percentage ="+Per);
	
	Per =gr. getPercentage(30, 49, 60, 50, 'b' );
	System.out.println(" Percentage =" +Per);

 	Per =gr. getPercentage(80, 50, 60, 70, 65, 76);
	System.out.println(" Percentage ="+Per);

	
 	System.out.println(" main method ended...");

       }

}