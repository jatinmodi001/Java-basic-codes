class Q
{
	boolean b = false;
	int num;
	public synchronized int get()
	{
		if(!b)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
		System.out.println("Got: "+num);
		b = false;
		notify();
		return num;
	}
	public synchronized void put(int num)
	{
		if(b)
		{
			try
			{
				wait();								// current thread ko waiting state mein dalega.
			}
			catch(InterruptedException oe)
			{
				System.out.println(oe);
			}
		}
		this.num  = num;
		b = true;
		System.out.println("Put: "+num);
	}
}
class Producer implements Runnable
{
	Q q;
	public Producer(Q q)
	{
		this.q = q;
		new Thread(this,"Producer").start();
	}
	public void run()
	{
		int i = 0;
		while(i<1)
		{
			q.put(i++);
		}
	}
}
class Consumer implements Runnable
{
	Q q;
	public Consumer(Q q)
	{
		this.q = q;
		new Thread(this,"Consumer").start();
	}
	public void run()
	{
		while(true)
		{
			q.get();
		}
	}
}
public class ThreadCommunication
{
	public static void main(String[] args)
	{
		Q m = new Q();
		new Producer(m);
		new Consumer(m);
	}
}