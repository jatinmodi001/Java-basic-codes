class Inheritance3
{
	public static void main(String[] args) 
	{
	//	C b1 = new C();
		C b = new C("Java");
	}
}
class A
{
	A()
	{
		System.out.println("Class A Default constructor");
	}
	A(String str)
	{
		System.out.println("Class A parametrized contructor" + str);
	}
}
class B extends A
{
	B()
	{
		System.out.println("Class B default constructor");
	}
	B(String str)
	{
		System.out.println("Class b parametrized constructor" + str);
	}
}
class C extends B
{
	C()
	{
		System.out.println("Class C default constructor");
	}
	C(String str)
	{
		super(" hello");
		System.out.println("Class C parametrized constructor" + str);
	}
}