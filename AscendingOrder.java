import java.util.Scanner;
public class AscendingOrder {

	public static void main(String[] args) {
		int [] arr= {3,2,1,7,5};
		int temp=0;
		System.out.println("Here Original Array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Elements of Array is Sorted in: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
