import java.util.*;
import static java.lang.System.*;
interface Series
{
	int GetNext();
	void reset();
	void setStart(int num);
}
class ByTwos implements Series
{
	int num;
	int n;
	public void setStart(int num)
	{
		this.num=num;
		this.n=num;
	}
	public int GetNext()
	{
		num=num+2;
		return num;
	}
	public void reset()
	{
		num=n;
	}
}
class Q4
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int next;
		ByTwos ob=new ByTwos();
		out.println("Enter number to set the value:");
		int a=sc.nextInt();
		ob.setStart(a);
		out.println("Enter choice: 1)Get Next 2)Reset 3)Exit");
		first:
		for(;;)
		{
			//out.println("Enter choice: 1)Get Next 2)Reset 3)Exit");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				next=ob.GetNext();
				out.println(next);
				break;
				case 2:
				ob.reset();
				break;
				case 3:
				break first;
			}
		}
	}
}