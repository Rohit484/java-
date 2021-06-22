import java.util.Scanner;
public class class17
{
   public static void main(String[]args)
{
         Scanner s=new Scanner(System.in);
       int a,b,c;
      System.out.println("Enter the first Value: ");
a=s.nextInt();
System.out.println("Enter the Second value: ");
b=s.nextInt();
c=a+b;
   if(c==23)
    System.out.println("Here value is Equvalent in 23 ");
else if(c>=23 && c<=50)
System.out.println("Here value is Equvalent in 50 ");
else if(c>=50 && c<=75)
System.out.println("Here value is Equvalent in 75 ");
else if(c>=75 && c<=100)
System.out.println("Here value is Equvalent in 100 ");
else
System.out.println("Here your value is greater than  100");
}
}