
public class newmain3 {

	public static void main(String[] args) {
		fun1();
		fun2();
		System.out.println("Back To Home: ");
		
	}
	static void fun1()
	{
		try {
	   
			System.out.println(10/2);
	     }
		catch(ArithmeticException e)
		{
			System.out.println("Can not divisivle by 0");
		}
		finally
		{
			System.out.println("End of fun1");
		}
	}
	static void fun2()
	{
		try {
		int [] arr= {1,2,3};
		System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Array Index ");
		}
		finally
		{
			System.out.println("End of fun2");
		}
	}

}
