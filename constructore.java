class base{
	
	base(int a)
	{
		System.out.println("Base Class Constructor: "+a);
	}
}
class child extends base
{ 
	child(int b)
	
	{
	
		super(b);
		System.out.println("Child Class Constructor: ");
	}
    	
}
public class constructor {
public static void main(String[]args)
{
	child c=new child(12);
	}
}
