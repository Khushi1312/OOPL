import java.util.Scanner;
class Sort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n,choice,i;
        System.out.print("Enter the array size:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the array elements:");
        for(i=0;i<n;i++)
        	arr[i]=sc.nextInt();
        System.out.println("Unsorted list is:");
        for(i=0;i<n;i++)
        	System.out.print(arr[i]+" ");
        Bubble(arr,n);
	}
	public static void Bubble(int [] arr,int n)
	{
        int i,j,choice,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter choice 1.ASCENDING 2.DESCENDING");
        choice=sc.nextInt();
        switch(choice)
        {
        	case 1:
             for(i=0;i<n-1;i++)
             {
             	for(j=1;j<n-i;j++)
             	{
             		if(arr[j-1]>arr[j])
             		{
             			temp=arr[j-1];
             			arr[j-1]=arr[j];
             			arr[j]=temp;
             		}
             	}
             }
             break;
            case 2:
              for(i=0;i<n-1;i++)
             { 
             	for(j=1;j<n-i;j++)
             	{
             		if(arr[j-1]<arr[j])
             		{
             			temp=arr[j-1];
             			arr[j-1]=arr[j];
             			arr[j]=temp;
             		}
             	}
             }
             break;
        }
        System.out.print("Sorted list is:\n");
        for(i=0;i<n;i++)
        	System.out.print(arr[i]+" ");
	}
}