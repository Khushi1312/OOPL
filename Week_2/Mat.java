import java.util.Scanner;
class Mat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int [2][2],b[][]=new int [2][2],res[][]=new int [2][2],i,j;
		System.out.println("Enter elements of Mat A:");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
				a[i][j]=sc.nextInt();
		}
		System.out.println("Enter elements of Mat B:");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
				b[i][j]=sc.nextInt();
		}
		res=Add(a,b);
		System.out.println("Result of addition is");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
				System.out.print(res[i][j]+" ");
			System.out.print("\n");
		}
	}
	public static int[][] Add(int a[][],int b[][])
	{
		int i,j,c[][]=new int[2][2];
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
				c[i][j]=a[i][j]+b[i][j];
		}
		return c;
	}
}