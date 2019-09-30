import java.util.*;
class Person
{
	private String name;
	private String bDate;
	Person(String n,String d)
	{
		name=n;
		bDate=d;
	}
	public String getName()
	{
		return name;
	}
	public String getDate()
	{
		return bDate;
	}
}
class CollegeGraduate extends Person 
{
	private float GPA;
	private int year;
	CollegeGraduate(float GPA,int year)
	{
		super("aaa","12/10/2001");
		this.GPA=GPA;
		this.year=year;
	}
	public float getGPA()
	{
		return GPA;
	}
	public int getYear()
	{
		return year;
	}
}
class Q1
{
	public static void main(String[] args)
	{
		CollegeGraduate ob=new CollegeGraduate(9,2018);
		System.out.println("Name: "+ob.getName());
		System.out.println("Bdate: "+ob.getDate());
		System.out.println("GPA: "+ob.getGPA());
		System.out.println("Year of joining: "+ob.getYear());
	}
}