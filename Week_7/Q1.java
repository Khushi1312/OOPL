import java.util.*;
import static java.lang.System.*;
class Phone
{
	String brand;
	int memCapacity;
	interface Callable
	{
		void makeAudioCall(String cellNum);
		void makeVideoCall(String cellNum);
	}
}
class BasicPhone extends Phone implements Phone.Callable
{
	BasicPhone()
	{
		Scanner sc=new Scanner(System.in);
		out.println("Enter Brand of basic phone:");
		brand=sc.nextLine();
		out.println("Enter Memory Capacity of basic phone:");
		memCapacity=sc.nextInt();
	}
	public void makeAudioCall(String cellNum)
	{
		out.println("Making Audio call from Basic phone");
	}
	public void makeVideoCall(String cellNum)
	{
		out.println("Making Video call from Basic phone");
	}
}
class SmartPhone extends Phone implements Phone.Callable
{
	SmartPhone()
	{
		Scanner sc=new Scanner(System.in);
		out.println("Enter Brand of smart phone:");
		brand=sc.nextLine();
		out.println("Enter Memory Capacity of smart phone:");
		memCapacity=sc.nextInt();
	}
	public void makeAudioCall(String cellNum)
	{
		out.println("Making Audio call from Smart phone");
	}
	public void makeVideoCall(String cellNum)
	{
		out.println("Making Video call from Smart phone");
	}
}
public class Q1
{
	public static void main(String[] args) {
		BasicPhone ob=new BasicPhone();
		ob.makeAudioCall("9819327492");
		ob.makeVideoCall("9819327492");
		SmartPhone ob1=new SmartPhone();
		ob1.makeAudioCall("9820502286");
		ob1.makeVideoCall("9820502286");
	}
}