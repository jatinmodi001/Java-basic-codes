class Inheritance4
{
	public static void main(String[] args)
	{
		A a = new A();
		A b = new B();
		A c = new C();
		a.display();
		b.display();
		c.display();
	}
}
class A
{
	void display()
	{
		System.out.println("Class A display");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("Class B display");
	}
}
class C extends A
{
	void display()
	{
		System.out.println("Class C display");
	}
}