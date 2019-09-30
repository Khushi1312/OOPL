import java.util.Scanner;
class Search
{
	public static void main(String args[])
	{
		int arr[]=new int[100],n,i,ele;
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		n=sc.nextInt();
		System.out.println("Enter array elements:");
		for(i=0;i<n;i++)
        	arr[i]=sc.nextInt();
        System.out.println("Enter element to be searched:");
        ele=sc.nextInt();
        Find(arr,n,ele);
	}
	public static void Find(int arr[],int n,int ele)
	{
		int i;
		for(i=0;i<n;i++)
		{
			if(arr[i]==ele)
				break;
			else
				continue;
		}
		System.out.println("Element found at position:"+(i+1));
	}
}