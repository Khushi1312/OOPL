import java.util.*;
abstract class Figure
{
	int a,b;
	abstract int area(int a,int b);
}
class Rectangle extends Figure
{
	public int area(int a,int b)
	{
		int ar;
		ar=a*b;
		return ar;
	}
}
class Triangle extends Figure
{
	public int area(int a,int b)
	{
		int ar;
		ar=a*b/2;
		return ar;
	}	
}
class Square extends Figure
{
	public int area(int a,int b)
	{
		int ar;
		ar=a*a;
		return ar;
	}
}
class Q3
{
	public static void main(String[] args) 
	{
		Figure ob=new Rectangle();
		System.out.println("Rectangle: "+ob.area(3,4));
		Figure ob1=new Triangle();
		System.out.println("Triangle: "+ob1.area(5,4));
		Figure ob2=new Square();
        System.out.println("Square: "+ob2.area(3,3));
	}
}