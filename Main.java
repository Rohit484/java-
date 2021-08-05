/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

/**
 *
 * @author ROHIT PANDEY
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter your String Name: ");
       String myString=s.next();
       System.out.println("Enter your age: ");
       int a=s.nextInt();
       System.out.println("Here your name is: "+myString);
       System.out.println("Here your age is: "+a);
       
    }
    
}
