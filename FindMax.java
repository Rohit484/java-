
public class FindMax {
    public static void main(String[]args)
    {
    	int [] arr={2,3,4,5,6};
    	arr[0]=60;
    	arr[1]=80;
    	arr[2]=44;
    	arr[3]=99;
    	arr[4]=230;
    	if(arr[0]>=arr[1] && arr[0]>=arr[2] && arr[0]>=arr[3] && arr[0]>=arr[4])
    	{
    		System.out.println("Here first value is: "+arr[0]);
    	}
    	else if(arr[1]>=arr[0] && arr[1]>=arr[2] && arr[1]>=arr[3] && arr[1]>=arr[4])
    	{
    		System.out.println("Here Second value is: "+arr[1]);
    	}
    	else if(arr[2]>=arr[0] && arr[2]>=arr[1] && arr[2]>=arr[3] && arr[2]>=arr[4])
    	{
    		System.out.println("Here Third value is: "+arr[2]);
    	}
    	else if(arr[3]>=arr[0] && arr[3]>=arr[1] && arr[3]>=arr[2] && arr[3]>=arr[4])
    	{
    		System.out.println("Here Third value is: "+arr[3]);
    	}
    	else if(arr[4]>=arr[0] && arr[4]>=arr[1] && arr[4]>=arr[2]&& arr[4]>=arr[3])
    	{
    		System.out.println("Here Third value is: "+arr[4]);
    	}
    	/*else
    		System.out.println("Here Not values ");*/
    }
}
