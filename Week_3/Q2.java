import java.util.Scanner;
class Time
{
	int hours;
	int mins;
	int sec;
	public void assign(int h,int m,int s)
	{
		hours=h;
		mins=m;
		sec=s;
	}
	public void display()
	{
		System.out.println(hours+":"+mins+":"+sec);
	}
	public Time add(Time t1)
	{
		Time temp=new Time();
		temp.sec=sec+t1.sec;
		temp.mins=mins+t1.mins;
		temp.hours=hours+t1.hours;
		if(temp.sec>=60)
        {
            temp.mins+=1;
            temp.sec-=60;
        }
        if(temp.mins>=60)
        {
            temp.mins-=60;
            temp.hours+=1;
        }
        if(temp.hours>=24)
        {
            temp.hours-=24;
        }
        return temp;
	}
	public Time sub(Time t2)
	{
		Time temp=new Time();
		temp.sec=sec-t2.sec;
		temp.mins=mins-t2.mins;
		temp.hours=hours-t2.hours;
        if(temp.sec<0)
        {
            temp.mins-=1;
            temp.sec+=60;
        }
        if(temp.mins<0)
        {
            temp.hours-=1;
            temp.mins+=60;
        }
        if(temp.hours<0)
        {
            temp.hours=-(temp.hours);
        }
		return temp;
	}
	public void compare(Time t3)
	{
    	if((hours==t3.hours)&&(mins==t3.mins)&&(sec==t3.sec))
    		System.out.println("Equal");
    	else if(hours>t3.hours)
    	{
    		System.out.println("T1 is greater");
    	}
    	else if(hours<t3.hours)
    	{
    		System.out.println("T2 is greater");
    	}
    	else if((hours==t3.hours)&&(mins>t3.mins))
        {
            System.out.println("T1 is greater");
        }
        else if((hours==t3.hours)&&(mins<t3.mins))
        {
            System.out.println("T2 is greater");
        }
        else if((hours==t3.hours)&&(mins==t3.mins)&&(sec>t3.sec))
        {
            System.out.println("T1 is greater");
        }
        else
        {
            System.out.println("T2 is greater");   
        }

	}
}
class Q2
{
	public static void main(String args[])
	{
		Time ob=new Time();
		Time ob1=new Time();
		Time ob2=new Time();
		Time ob3=new Time();
		ob1.assign(12,30,10);
		ob2.assign(12,30,10);
        ob1.display();
        ob2.display();
        ob=ob1.add(ob2);
        ob3=ob1.sub(ob2);
        System.out.println("add:");
        ob.display();
        System.out.println("sub:");
        ob3.display();
        ob1.compare(ob2);
	}
}
