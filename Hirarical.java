
class book3{
	int isbn;
	String title,language;
	void getbook(int i, String t, String l)
	{
		isbn=i;
		title=t;
		language=l;
	}
	void showbook()
	{
		System.out.println("ISBN: "+isbn);
		System.out.println("Title: "+title);
		System.out.println("Language: "+language);
	}
}
class textbook extends book3{
	String course;
	int edition;
	void gettextbook(String cs,int ed) {
		course=cs;
		edition=ed;
		
	}
	void showtextbook()
	{
		System.out.println("Course "+course);
		System.out.println("Edition "+edition);
	}
	
}
class novel extends book3{
	String author,category;
	void getnovel(String au,String cat)
	{
		author=au;
		category=cat;
	}
	void shownovel()
	{
		System.out.println("Author: "+author);
		System.out.println("Catogory: "+category);
	}
}
public class Hirarical {

	public static void main(String[] args) {
		textbook t1=new textbook();
		t1.getbook(3984,"OrganicChemisty","ENGLISH");
		t1.gettextbook("BSC",2020);
		t1.showbook();
		t1.showtextbook();
       novel n1=new novel();
       n1.getbook(4890,"Crime Stories","English");
       n1.getnovel("Ram Bharose","Fiction");
       n1.showbook();
       n1.shownovel(); 
	}

}

