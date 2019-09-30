import java.util.Scanner;
import java.lang.Math;

class Fact
{
	public static void main (String args[])
	{
		System.out.print("WELCOME");		
		int n,r,nCr;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of n and r:");
		n=sc.nextInt();
		r=sc.nextInt();
        nCr=(fact(n)*fact(n-r))/fact(r);
        System.out.print("\nValue of nCr is:"+nCr);
	}
	public static int fact(int a)
	{
		int i,prod=1;
		i=a;
		while(i>0)
		{
			prod=prod*i;
			i--;
		}
		return prod;
	}
}
