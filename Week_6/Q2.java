import myPackages.p1.*;
import java.util.*;
class Q2
{
	public static void main(String[] args) 
	{
		Maximum ob1=new Maximum();
		int a[]={2,76,45,4,9};
		int b[][]={{19,22,3},{55,9,99},{4,76,8}};
		System.out.println(ob1.max(22,99,799));
		System.out.println(ob1.max(1.4f,5.5f,8.8f));
		System.out.println(ob1.max(a,5));
		System.out.println(ob1.max(b,3,3));
	}
}