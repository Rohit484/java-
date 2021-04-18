
public class Exception3 {
	public static void main(String[]args)
	{
		try {
		System.out.println(10/0);
		int [] arr= {1,2,3};
		System.out.println(arr[10]);
		}
		catch(Exception e)
		{
			System.out.println("Here is error");
		}
	}

}
