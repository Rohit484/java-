import java.util.Scanner;
import java.util.Arrays;
public class StackAsending
{
    public static void main (String[]args)
    {
        String line;
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers you want to input?: ");
        line = in.nextLine();
        System.out.print("Input Number 1: " );
        line = in.nextLine();
        System.out.print("Input Number 2: ");
        line = in.nextLine();
        System.out.print("Input Number 3: " );
        line = in.nextLine();
        System.out.print("Input Number 4: ");
        line = in.nextLine();
        System.out.print("Input Number 5: " );
        line = in.nextLine();
    }
    public static void StackAsending (double[]arr)
    {
        Arrays.sort(arr); 
        System.out.printf("Sorted arr[] = %s", 
        Arrays.toString(arr)); 

}}
