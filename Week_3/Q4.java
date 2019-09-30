import java.util.*;
import java.io.*;
import java.lang.Math;

class Stack
{
	int arr[] = new int [1000];
	int top;
	Stack()
	{
		top = -1;
	}
	public void push(int a)
	{
		if(top == 999)
			System.out.println("overflow");
		else arr[++top] = a;
	}
	public void pop()
	{
		if(top == -1)
			System.out.println("underflow");
		else
			top = top - 1;
	}
	public void display()
	{
		int i;
		for(i = top; i >= 0; i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

class Q4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Stack s1 = new Stack();
		System.out.println("Enter number of Queries, Use 1 to push, 2 to pop, 3 to display");
		int q = sc.nextInt();
		for(int i = 0; i < q; i++)
		{
			int p = sc.nextInt();
			System.out.println("Enter 1 to push, 2 to pop, 3 to display");
			if(p == 1)
			{
				
				int a = sc.nextInt();
				s1.push(a);
			}
			else if(p == 2)
			{
				s1.pop();
			}
			else
			{
				s1.display();
			}
		}
	}
}
