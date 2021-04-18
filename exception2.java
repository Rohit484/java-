
public class exception2 {
public static void main(String[]args)
{
	try {
	int [] arr=new int[5];
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	arr[4]=50;
	System.out.println(arr[2]);
	}
	catch(Exception e)
	{
		System.out.println("Invailid Index Array");
		
	}
}
}
