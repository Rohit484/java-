class doctor{
	String name,qualification;
	void input1(String nm,String quali)
	{
		name=nm;
		qualification=quali;
	}
	void output1()
	{
		System.out.println("Name of the doctor: "+name);
		System.out.println("Qualification: "+qualification);
	}
}
class cardiologist extends doctor
{
   String specialisation;
   int fees;
   void input2(String specs,int f)
   {
	   specialisation=specs;
	   fees=f;
   }
   void output2()
   {
	   System.out.println("Specialisation: "+specialisation);
	   System.out.println("Fees: "+fees);
   }
}
public class Hospital {
	public static void main(String[]args)
	{
		cardiologist dilkadoctor=new cardiologist();
		dilkadoctor.input1("Dr.Rohit Dubey", "MD");
		dilkadoctor.input2("Surgery", 45600);
		dilkadoctor.output1();
		dilkadoctor.output2();
	}
  
}
