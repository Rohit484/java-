import java.util.Scanner;
class perimeter{
	int r,l,b,s1,s2,s3,a1,a2,ar;
	double pi=3.14,perimeter;
	Scanner s=new Scanner(System.in);
	void circle()
	{
		System.out.println("Enter the radius of circle: ");
		r=s.nextInt();
		perimeter=2*pi*r;
		System.out.println("Perimeter of circle: "+perimeter);
	}
	void rectangle()
	{
		System.out.println("Enter the length of rectangle: ");
	    l=s.nextInt();
	    System.out.println("Enter the breadth of rectangle: ");
	    b=s.nextInt();
	    perimeter=2*(l+b);
	    System.out.println("Perimeter of rectangular: "+perimeter);
	    }
	void triangle()
	{
		System.out.println("Enter the lenght of first side of triangle: ");
		s1=s.nextInt();
		System.out.println("Enter the lenght of second side of triangle: ");
		s2=s.nextInt();
		System.out.println("Enter the length of third side of triangle: ");
		s3=s.nextInt();
		perimeter=s1+s2+s3;;
		System.out.println("Perimeter of triangle of:"+perimeter);
	}
	void area()
	{
		System.out.println("Enter the Width: ");
		a1=s.nextInt();
		System.out.println("Enter the Height: ");
		a2=s.nextInt();
		ar=a1*a2;
		System.out.println("Here total area of: "+ar);
	    	
	}
}
public class Triangle {

	public static void main(String[] args) {
		perimeter obj=new perimeter();
		obj.circle();
		obj.rectangle();
		obj.triangle();
		obj.area();
		

	}

}
