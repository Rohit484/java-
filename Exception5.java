
public class Exception5 {
	public static void main(String[]args)
	{
		try
		{
			System.out.println(10/2);
			int [] arr= {1,2,3};
			System.out.println(arr[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("No Can Not divided by 0");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid array index: ");
		}
	}

}
