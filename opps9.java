class stud{
	int rollno,marks;
	String name;
	stud()
	{}//DEFAULT CONSTRUCTOR
	stud(int rno,String nm,int m)//ARGUMENT &COPY CONSTRUCTOR
	{
		rollno=rno;
		name=nm;
		marks=m;
	}
	stud(stud s)
	{
		rollno=102;
		name=s.name;
		marks=s.marks-5;
	}
	void output()
	{
		System.out.println("Roll No: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
	}
}
public class oops10 {
	public static void main(String[]args)
	{
		stud s1=new stud(101,"A",80);
		stud s2=new stud();
		//s1.input(101,"A",80);
		//s2.input(101,"A",70);
		stud s3=new stud(s1);
		s2=s1;
		s1.output();
		s2.output();
		s3.output();
		/*s2.output();
		s2.output();*/
	}

}
