/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROHIT PANDEY
 */
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
 
   System.out.println("Capital");
else if(ch>='a' && ch<='z')
System.out.println("Small");
else
System.out.println("Digit");
       
}
}
