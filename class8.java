import java.util.Scanner;
public class class8
{
    public static void main(String[]args)
{
    Scanner s=new Scanner(System.in);
    int a,b,sum=0;
       System.out.println("Enter the numbers:");
      for(a=1;a<=5;a++)
{
          b=s.nextInt();
          sum+=b;
}
System.out.println("Here your Total sum is: "+sum);
}
}