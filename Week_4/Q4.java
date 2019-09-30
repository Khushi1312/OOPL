import java.util.Scanner;
class Counter
{
	static int count=0;
	Counter()
	{
		count++;
	}
	static void showCount()
	{
		System.out.println("No of objects is:"+count);
	}
}
class Q4
{
	public static void main(String args[])
	{
		Counter c=new Counter();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of objects");
		n=sc.nextInt();
		Counter[] c1=new Counter[n];
		for(int i=0;i<n;i++)
		{
			c1[i]=new Counter();
		}	
		c.showCount();
	}
}