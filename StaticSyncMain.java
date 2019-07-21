class Message
{
	public synchronized static void displayMsg()
	{
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" i:-"+i);
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
class MyThread21 implements Runnable
{
	Thread t;
	Message msg;
	MyThread21 (Message msg)
	{
		this.msg = msg;
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		msg.displayMsg();
	}
}
public class StaticSyncMain 
{
	public static void main(String args[])
	{
		Message msg1 = new Message();
		Message msg2 = new Message();
		MyThread21 m1 = new MyThread21(msg1);
		MyThread21 m2 = new MyThread21(msg1);
		MyThread21 m3 = new MyThread21(msg2);
		MyThread21 m4 = new MyThread21(msg2);
	}
}
