class Final
{
	public static void main(String[] args) 
	{
		A a = new A();
		System.out.print(a.show(10));
	}
}
class A
{
	final int x;
	A()
	{
		x = 10;
	}
	int show(final int y)
	{
		//y++;
		return y;
	}
}
class B extends A
{
	int x = 20;
}
