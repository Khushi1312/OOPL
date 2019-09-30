import java.util.Scanner;
class Complex
{
	double real;
	double img;
	public void assign(double real,double img)
	{
		this.real=real;
		this.img=img;
	}
	public void display(Complex n1)
	{
		System.out.println(n1.real+" +i"+n1.img);
	}
	public Complex add(Complex n2)
	{
		Complex temp=new Complex();
		temp.real=this.real+n2.real;
		temp.img=this.img+n2.img;
		display(temp);
		return temp;
	}
	public Complex sub(Complex n2)
	{
		Complex temp=new Complex();
		temp.real=this.real-n2.real;
		temp.img=this.img-n2.img;
		display(temp);
		return temp;
	}
}
class Q1
{
	public static void main(String args[])
	{
		Complex n=new Complex();
		Complex n1=new Complex();
		Complex n2=new Complex();
		n1.assign(3.5,3.0);
		n2.assign(4.0,2.5);
		System.out.println("Numbers are:"+n1.real+"+i"+n1.img+" and "+n2.real+"+i"+n2.img);
        n=n1.add(n2);
        n=n1.sub(n2);
	}
}