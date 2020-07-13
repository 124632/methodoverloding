class Grades
{
  	double getPercentage(int m1, int m2, int m3, int m4, char courseName )
        {
	System.out.println("4 subject method..");
	double maxmarks=0;
	if(courseName == 'b' )
            {
	maxmarks =500;
           }
else
     {
	maxmarks =400;
         }
	double res = (m1+m2+m3+m4 ) /maxmarks*100;
	return res;
        }
	double getPercentage(int m1, int m2, int m3, int m4, int m5, int m6)
        {
	System.out.println("6 subject method..");
	double res = (m1+m2+m3+m4+m5+m6 ) /600.0*100;
	return res;
        }
	double getPercentage(int m1,int m2,int m3)
        {
	System.out.println("3 subject method..");
	double res = (m1+m2+m3 ) /300.0*100;
	return res;
        }
}