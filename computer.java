class Laptop{
	String processor;
	int ram,storage;
	void getLaptop(String pro,int r,int st)
	{
		processor=pro;
		ram=r;
		storage=st;
	}
	void showLaptop()
	{
		System.out.println("Processor "+processor);
		System.out.println("Ram: "+ram);
		System.out.println("Storage: "+storage);
	}
}
class desktop extends Laptop
{
    	String company,model;
    	void getdesktop(String co,String m)
    	{
    		company=co;
    		model=m;
    	}
    	void showdesktop()
    	{
    		System.out.println("Company "+company);
    		System.out.println("Model "+model);
    	}
}
public  class computer {

	public static void main(String[] args) {
		desktop mylaptop=new desktop();
		mylaptop.getLaptop("Corei7",4,500);
		mylaptop.getdesktop("Hp","4Afg545");
		mylaptop.showLaptop();
		mylaptop.showdesktop();

	}

}
