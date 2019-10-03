import java.util.*;
import static java.lang.System.*;

class StackFullException extends Exception
{
	int size;
	StackFullException(int s)
	{
		super("Stack Full");
		size=s;
	}
	public String toString()
	{
		return "Stack is Full. Max stack size is:"+size;
	}
}

class StackEmptyException extends Exception
{
	StackEmptyException()
	{
		super("Stack Empty");
	}
	public String toString()
	{
		return "Stack is Empty.";
	}
}

interface GenStack<T>
{
	public void push(T item) throws StackFullException;
	public T pop() throws StackEmptyException;
	public boolean isFull();
	public boolean isEmpty();
}

class GenStackDemo<T> implements GenStack<T>
{
	private T data[];
	private int tos;

	GenStackDemo(T[] arrayRef)
	{
		data=arrayRef;
		tos=-1;
	}
	public void push(T item) throws StackFullException
	{
		if(isFull())
			throw new StackFullException(data.length);
		data[++tos] =item;
		
	}
	public T pop() throws StackEmptyException
	{
		if(isEmpty())
			throw new StackEmptyException();
		return data[tos--];
	}
	public boolean isEmpty()
	{
		return tos==-1;
	}
	public boolean isFull()
	{
		return tos==data.length;
	}
}


class Student
{
	int rNO;
	String name;
	Student(int r,String n)
	{
		rNO=r;
		name=n;
		out.println("Name: "+name+" Roll no.: "+rNO);
	}
	public String toString()
	{
		return "Name: "+name+" Roll no.: "+rNO;
	}
}

class Employee
{
	int idNo;
	String name;
	Employee(int i,String n)
	{
		idNo=i;
		name=n;
		out.println("Name: "+name+" ID no.: "+idNo);
	}
	public String toString()
	{
		return "Name: "+name+" ID no.: "+idNo;
	}
}
class Q2
{
	public static void main(String[] args) 
	{
		int i;
		Student[] st=new Student[3];
		GenStackDemo<Student> stck=new GenStackDemo<Student>(st);
		Employee[] em=new Employee[2];
		GenStackDemo<Employee> stck1=new GenStackDemo<Employee>(em);
		try
		{
			out.println("Demonstrating Student Stack:");
			out.println("Pushing: Student");
			stck.push(new Student(1,"Khushi"));
			stck.push(new Student(2,"Anushka"));
			stck.push(new Student(3,"Annika"));
			out.println("Popping: Students");
			while(!stck.isEmpty())
			{
				out.println(stck.pop()+"");
			}
			out.println("\nDemonstrating Employee Stack:");
			out.println("Pushing: Employee");
			stck1.push(new Employee(1,"Ajay"));
			stck1.push(new Employee(2,"Sachin"));
			out.println("Popping: Employees");
			while(!stck1.isEmpty())
			{
				out.println(stck1.pop()+"");
			}
		}
		catch(StackEmptyException e)
		{
			out.println(e);
		}
		catch(StackFullException e)
		{
			out.println(e);
		}
	}
}