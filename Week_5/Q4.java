import java.util.*;
class Q4
{
	public static void main(String args[])
	{
		String s;
		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter number");
 		s=sc.next();
 		commas(s);
	}
	public static void commas(String s)
	{
		char ch;
		String result="";
		int counter=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			ch=s.charAt(i);
			counter++;
			result=ch+result;
			if(counter%3==0)
				result=","+result;
		}
		System.out.println("Result: "+result);
	}
}