public class simple7
{
	public static void main(String[]args)
	{
		int arr[]=new int[5];
		arr[0]=60;
		arr[1]=80;
		arr[2]=44;
		arr[3]=99;
		arr[4]=23;
		
		if(arr[0]>=arr[1] && arr[0]>=arr[2] && arr[0]>=arr[3]&&arr[0]>=arr[4])
		{
			System.out.println("Here arr[o] is: "+arr[0]);
		}
		else if(arr[1]>=arr[0] && arr[1]>=arr[2] && arr[1]>=arr[3]&&arr[1]>=arr[4])
		{
			System.out.println("Here arr[1] is: "+arr[1]);
		}
		else if(arr[2]>=arr[0] && arr[2]>=arr[1] && arr[2]>=arr[3]&&arr[2]>=arr[4])
		{
			System.out.println("arr[3]"+arr[2]);
		}
		else if(arr[3]>=arr[0] && arr[3]>=arr[1] && arr[3]>=arr[2]&&arr[3]>=arr[4])
		{
			System.out.println("Here arr[3]"+arr[3]);
		}
		else if(arr[4]>=arr[0] && arr[4]>=arr[1] && arr[4]>=arr[2]&&arr[4]>=arr[3])
		{
			System.out.println("Here arr[4]"+arr[4]);
		}
		
	}
	}
