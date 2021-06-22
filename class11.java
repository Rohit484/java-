import java.util.Scanner;
public class class11
{
    public static void main(String[]args)
{
      Scanner s=new Scanner(System.in);
    String str,lhs,rhs,pos;
int a,b,c;
System.out.println("Enter An Equations ");
str=s.nextLine();
pos=str.indexOf("+")

lhs=str.substring(0,pos);
rhs=str.substring(pos+1,str.length());
System.out.println("Left "+lhs);
System.out.println("Right "+rhs);
a=Integer.parseInt(lhs);
b=Integer.parseInt(rhs);
c=a+b;
System.out.println("Toatl Sum is "+c);

}
}