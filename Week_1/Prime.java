import java.util.Scanner;

class Prime
{
	public static void main(String args[])
	{
        int n,pflag,i;
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of n:");
		n=sc.nextInt();
		for(i=2;i<=n;i++)
		{
			pflag=isPrime(i);
		     if(pflag!=1)
			    System.out.print("\n"+i);
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