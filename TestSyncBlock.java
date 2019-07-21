import java.util.*;
import java.lang.*;
class Table
{
	void printTable(int n)
	{
		synchronized(this)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(n*i);
				try
				{
					Thread.sleep(500);
				}
				catch(InterruptedException ie)
				{
					System.out.println(ie);
				}
			}
		}
	}
}
class MyThread1 extends Thread
{
	Table t;
	MyThread1(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.print(5);
	}
}
class MyThread2 extends Thread
{
	Table t;
	MyThread2(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.print(3);
	}
}
class TestSyncBlock
{
	public static void main(String[] args) 
	{
		Table obj = new Table();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();		
	}
}