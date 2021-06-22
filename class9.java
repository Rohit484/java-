import java.util.Scanner;
public class class9
{
     public static void main(String[]args)
     {
        Scanner s=new Scanner(System.in);
      char ch;
System.out.println("Enter the character");
      ch=s.next().charAt(0);
  if(ch>='A' && ch<='Z')
   System.out.println("Capital"+ch);
else if(ch>='a' && ch<='z')
System.out.println("Small"+ch);
else
System.out.println("Digit"+ch);
       
}
}