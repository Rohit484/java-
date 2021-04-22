
public class ARR {
	public static void main(String[]args)
	{
		int [] arr=new int [5];
		double arr2[]=new double[7];
		int [] arr3;
		arr3=new int[10];
		char [] c= {'a','e','i','o','u'};
		int i,no=2;
		for(i=0;i<5;i++)
		{
			arr[i]=no;
			no+=2;
		}
		for(i=0;i<5;i++)
			System.out.println(arr[i]);
		for(i=0;i<c.length;i++)
			System.out.println(c[i]);
	}

}
