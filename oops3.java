class Teacher{
	String name,quali;
	int exp;
	void input(String name,String q,int ex)
	{
		this.name=name;
		quali=q;
		exp=ex;
	}
	void output()
	{
		System.out.println("Name: "+name);
		System.out.println("Qualification: "+quali);
		System.out.println("Exp: "+exp);
		System.out.println("_________________________________________________");
	}
	void cheak()
	{
		if(exp>10)
			System.out.println("The Teachers has experience: ");
	}
	
}
 class oops3 {
	public static void main(String[]args)
	{
		Teacher t1=new Teacher();
		Teacher t2=new Teacher();
		t2.input("Rohit Pandey","B-Tech", 2);
		t1.input("Mr.A","phd",16);
		t1.output();
		t2.output();
		//t1.cheak();
		t2.cheak();
	}

}
