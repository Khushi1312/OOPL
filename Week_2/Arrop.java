import java.util.Scanner;
class Arrop
{
	public static void main(String args[])
	{
		int arr[]=new int[100],n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		n=sc.nextInt();
		System.out.println("Enter array elements:");
		for(i=0;i<n;i++)
        	arr[i]=sc.nextInt();
        operation(arr,n);
	}
	public static void operation(int [] arr,int n)
	{
		int i,pos,ele,choice;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter choice 1.INSERT 2.DELETE");
        choice=sc.nextInt();
		switch(choice)
		{
			case 1:
             System.out.println("Enter position and element to insert");
		     pos=sc.nextInt();
			 ele=sc.nextInt();
	   		 n++;
             for(i=n-1;i>=pos-1;i--)
        	   arr[i+1]=arr[i];
             arr[pos-1]=ele;
             System.out.println("Array after insertion:");
             for(i=0;i<n;i++)
        	    System.out.print(arr[i]+" ");
        	break;
        	case 2:
             System.out.println("Enter position to delete");
		     pos=sc.nextInt();
		     for(i=pos-1;i<n;i++)
		     	arr[i]=arr[i+1];
		     n--;
             System.out.println("Array after deleting:");
             for(i=0;i<n;i++)
        	    System.out.print(arr[i]+" ");

		}
		
        
	}

}