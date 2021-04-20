import java.util.Scanner;
import java.util.Arrays;
public class ArraySort {

	public static void main(String[] args) {
		int a,b,c,d,e,temp;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		d=Integer.parseInt(args[3]);
		e=Integer.parseInt(args[4]);
		for(int i=0; i<args.length;i++)
		{
			for(int j=0;j<args.length;j++)
				if(args[j]>args[i])
				{
					temp=args[i];
					args[i]=args[j];
					args[j]=temp;
				}
		}
		for(int i=0;i<args.length;i++)
		{
			System.out.println("Sorted Array in Ascending Order: "+args[i]);
		}

	}

}
