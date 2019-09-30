import java.util.*;
import static java.lang.System.*;

class Queue
{
	int n;
	boolean valueSet=false;
	synchronized int get()
	{
		while(!valueSet)
			try{
				wait();
			}
			catch(InterruptedException e){
				out.println("Caught "+e);
			}
			out.println("Got: "+n);
			out.println();
			valueSet=false;
			notifyAll();
			return n;
	}
	synchronized void put(int n)
	{
		while(valueSet)
			try{
				wait();
			}
			catch(InterruptedException e){
				out.println("Caught "+e);
			}
		this.n=n;
		valueSet=true;
		out.println("Put: "+n);
		notifyAll();
	}
}
class Producer implements Runnable
{
	Queue q;
	Producer(Queue q)
	{
		this.q=q;
		new Thread(this, "Producer").start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
		}
	}
}
class Consumer implements Runnable
{
	Queue q;
	Consumer(Queue q)
	{
		this.q=q;
		new Thread(this, "Consumer").start();
	}
	public void run()
	{
		while(true)
		{
			q.get();
		}
	}
}
class Q3
{
	public static void main(String[] args) {
		Queue q=new Queue();
		new Producer(q);
		new Consumer(q);
		out.println("Press ctr+c to stop.");
	}
}