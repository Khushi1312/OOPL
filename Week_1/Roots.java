import java.util.Scanner;
import java.lang.Math;
class Roots
{
	public static void main(String[] args)
	{
		int a,b,c,d,flag;
		float x1,x2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the values of a b c:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		root(a,b,c);

	}
	public static void root(int a,int b,int c)
	{
           int d,flag;
           float x1,x2;
           d=b*b-4*a*c;
		   if(d>0)
			flag=1;
		   else if(d==0)
			flag=2;
		   else
			flag=3;
		   switch(flag)
		   {
			case 1:
			  System.out.print("\n Real and distinct roots");
			  x1=(float)((-b+Math.sqrt(d))/(2*a));
			  x2=(float)((-b-Math.sqrt(d))/(2*a));
			  System.out.println("Roots are"+x1+"and"+x2);
			  break;
			case 2:
		      System.out.print("\n Real root");
			  x1=(float)((-b)/(2*a));
			  System.out.println("Roots is"+x1);
			  break;
			case 3:
			  System.out.print("\n Real and imaginary roots");
			  x1=(float)((-b+Math.sqrt(Math.abs(d)))/(2*a));
			  x2=(float)((-b-Math.sqrt(Math.abs(d)))/(2*a));
			  System.out.println("\nRoots are"+x1+"and"+x2);
			  break;

		    }  

		}
}
