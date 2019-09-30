import java.util.*;
import java.io.*;

class Student
{
	String regno;
	String name;
	GregorianCalendar gcal;
	short sem;
	float gpa;
	float cgpa;
	private static int count = 0;
	int finalnum;
	Student()
	{
		name = "Not-Available";
		sem = 0;
		gpa = 0;
		cgpa = 0;
	}
	Student(String n, GregorianCalendar gc, short s, float g, float c)
	{
		name = n;
		sem = s;
		gpa = g;
		cgpa = c;
		gcal = gc;
		count++;
		finalnum = count;
	}
	void regcreator()
	{
		regno = Integer.toString((gcal.get(Calendar.YEAR))%100) +Integer.toString(0)+ Integer.toString(finalnum);
	}
	void display()
	{
		System.out.println("Registration Number: "+regno);
		System.out.println("Name: "+name);
		System.out.println("Year of Joining: "+gcal.get(Calendar.YEAR));
		System.out.println("Semester: "+sem);
		System.out.println("GPA: "+gpa);
		System.out.println("CGPA: "+cgpa);
		System.out.println();
	}
}

class Lab5Q1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[5];
		int i, j;
		for(i = 0; i < 5; i++)
		{
			System.out.println("Student "+(i+1));
			System.out.println("Enter Name :");
			String name = sc.nextLine();
			System.out.println("Enter Year, Month, Date of Joining:");
			int year = sc.nextInt();
			int month = sc.nextInt();
			int date = sc.nextInt();
			GregorianCalendar cal = new GregorianCalendar(year, month, date);
			System.out.println("Enter Semester:");
			short sem = sc.nextShort();
			System.out.println("Enter GPA:");
			float gpa = sc.nextFloat();
			System.out.println("Enter CGPA:");
			float cgpa = sc.nextFloat();
			sc.nextLine();
			s[i] = new Student(name, cal, sem, gpa, cgpa);
		}
		for(i = 0; i < 5; i++)
		{
			s[i].regcreator();
		}
		System.out.println("Sorted on semester and cgpa: ");
		for(i = 0; i < 5; i++)
		{
			for(j = 0; j < 4-i; j++)
			{
				if(s[j].sem < s[j+1].sem)
				{
					Student temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
				else if(s[j].sem == s[j+1].sem)
				{
					if(s[j].cgpa < s[j+1].cgpa)
					{
						Student temp = s[j];
						s[j] = s[j+1];
						s[j+1] = temp;
					}
				}
			}

		}
		for(i = 0; i < 5; i++)
		{
			s[i].display();
		}
		System.out.println("Sorted by name:\n");
		for(i = 0; i < 5; i++)
		{
			for(j = 0; j < 4-i; j++)
			{
				if(s[j].name.compareTo(s[j+1].name)>0)
				{
					Student temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
		for(i = 0; i < 5; i++)
		{
			s[i].display();
		}
		System.out.println("Enter First Character:");
		String ch = sc.next();
		for(i = 0; i < 5; i++)
		{
			if(s[i].name.startsWith(ch))
			{
				s[i].display();
			}
		}
		System.out.println("Enter substring:");
		String str = sc.next();
		for(i = 0; i < 5; i++)
		{
			if(s[i].name.indexOf(str) > 0)
			{
				s[i].display();
			}
		}
		System.out.println("Initials:");
		for(i = 0; i < 5; i++)
		{
			int h = s[i].name.lastIndexOf(" ");
			String p = s[i].name.charAt(0) + ".";
			String shortname = p.concat(s[i].name.substring(h+1));
			System.out.println(shortname);
		}
	}
}
