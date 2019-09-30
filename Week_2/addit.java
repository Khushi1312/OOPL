import java.util.Scanner;

class addit
{
	public static void main(String args[])
	{
	System.out.println("GOOD AFTERNOON");
        int n,pflag,i;
        int arr[]=new int[100];
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		n=sc.nextInt();
		System.out.println("Enter array elements:");
		for(i=0;i<n;i++)
        	arr[i]=sc.nextInt();
		for(int j=0;j<n;j++)
		{
			pflag=isPrime(arr[j]);
		     if(pflag!=1)
			    System.out.print("\n"+arr[j]);
		else
			continue;
	    }
	}
	public static int isPrime(int a)
	{
		int flag=0,i;
		for(i=2;i<=a/2;i++)
		{
			if(a%i==0)
				{
					flag=1;
					break;
				}


		}
		return flag;
	}
}
