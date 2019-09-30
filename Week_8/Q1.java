import java.util.*;
import static java.lang.System.*;
class Table
{
  void printTable(int n)
  {
      for(int i=1;i<=5;i++)
      {
        System.out.println(+n+"*"+i+"="+(n*i));
      }
  }
}

class Mythread5 extends Thread
{
  Table t;
  Mythread5(Table t)
  {
    this.t=t;
  }
  public void run()
  {
    t.printTable(5);
  }
}


class Mythread7 extends Thread
{
  Table t;
  Mythread7(Table t)
  {
    this.t=t;
  }
  public void run()
  {
    t.printTable(7);
  }
}

class Q1
{
  public static void main(String args[])
  {
    Table obj = new Table();
    Mythread5 th1 = new Mythread5(obj);
    Mythread7 th2 = new Mythread7(obj);
    th1.start();
    try{
      th1.join();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    th2.start();
  }
}