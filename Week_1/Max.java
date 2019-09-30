import java.util.Scanner;
class Max
{
	public static void main(String args[])
	{
	   int a,b,c,max;
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the three numbers:");
	   a=sc.nextInt();
	   b=sc.nextInt();
	   c=sc.nextInt();
	   max=largest(a,b,c);
	   System.out.println("Largest is:"+max);
  

	}
	public static int largest(int a,int b,int c)
	{
		if(a>b&&a>c)
	   	return a;
	   else if(b>c)
	   	return b;
	   else
	   	return c;
	}
}