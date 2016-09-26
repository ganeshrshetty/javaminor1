package minorexam1;

public class university {
	public static String C_CODE="E30 and E241";
	school[] a=new school[8];
	//static
	//{
	//	System.out.println("BVB university");
	//}
	class school
	{
	private  String programcode;
	private int no_of_stud;
	private String schoolCoordinator;
	private int no_of_staff;
		//return programcode;
	
	//public static String getC_CODE() {
		//return C_CODE;
	//}
	//public school[] getA() {
		//return a;
	//
	
	public String getProgramcode() {
		return programcode;
	}
	public int getNo_of_stud() {
		return no_of_stud;
	}
	public String getSchoolCoordinator() {
		return schoolCoordinator;
	}
	public int getNo_of_staff() {
		return no_of_staff;
	}
	public school(String programcode,String schoolCoordinator,int no_of_stud, int no_of_staff) 
	{
		super();
		//this.a = a;
		this.programcode = programcode;
		this.no_of_stud = no_of_stud;
		this.schoolCoordinator = schoolCoordinator;
		this.no_of_staff = no_of_staff;
	}
	}
	void createschool()
	{
		a[0]=new school("CS01","SHARAT",110,10);
		a[1]=new school("CIVIL01","KISHORE",112,12);
		a[2]=new school("MECH01","AMOGH",116,16);
		a[3]=new school("ROBOTICS01","RAM",120,12);
		a[4]=new school("BIOTECH01","RAJ",132,22);
		a[5]=new school("IS01","CHETAN",140,16);
		a[6]=new school("EC01","RAKESH",122,16);
		a[7]=new school("EE01","VISHAL",150,18);
	}
	void calculate()
	{
		int j;
		for(j=0;j<8;j++)
		{
			if(a[j].getNo_of_stud()>120)
			{
				System.out.println("The program code :" + a[j].getProgramcode() + "has expected max list");
			}
			else
			{
				System.out.println("total strength of" +a[j].getProgramcode() +a[j]);
			}
		}
	}
}
