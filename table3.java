import java.util.Scanner;

public class table3
{
    public static void main(String args[])
    {
        int num, i, table;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a Number : ");
        num = sc.nextInt();
		
        System.out.print("Table of " + num + " is\n");
        for(i=1; i<=10; i++)
        {
            table = num*i;
            System.out.print(num + " * " + i + " = " + tab + "\n");
        }
    }
}