import java.util.Scanner;

class SeatsFilledException extends Exception {
	public String toString()
	{
		return "SEATS FULL!!!";
	}
}

class Student 
{	
	String name;
	int yearJoined;
	int regNo;

	static int seatNo = 1;

	public Student () 
	{
		name = "";
		yearJoined = 0;
		regNo = 0;
	}
	
	public void input () throws SeatsFilledException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter year of joining: ");
		yearJoined = sc.nextInt();
		if (seatNo > 5)
			throw new SeatsFilledException();
		else
			regNo = (yearJoined % 100) * 100 + seatNo;
		seatNo++;
	}

	public void display () 
	{
		System.out.println("\nName: " + name);
		System.out.println("Year of Joining " + yearJoined);
		System.out.println("Registration Number " + regNo);
	}	
}

public class Q3
{	
	public static void main (String [] args) 
	{	
		Scanner sc = new Scanner(System.in);
		Student studs[] = new Student[30];
		
		for (int i = 0; i < 10; ++i) 
		{
			System.out.println("\nEnter details of student " + (i+1) + ": ");
			studs[i] = new Student();
			try 
			{
				studs[i].input();
			}
			catch (SeatsFilledException e) 
			{
				System.out.println(e);
				studs[i] = null;
				break;
			}
			System.out.print("\n1) Continue 2) Exit ");
			int ch = sc.nextInt();
			if (ch != 1)
				break;
		}
		
	}
}