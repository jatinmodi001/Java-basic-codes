class AbstractDemo
{
	public static void main(String[] args) 
	{
		Figure f1 = new Figure(10,6);
		System.out.print(f1.area());		
	}
}
abstract class Figure
{
	int l,b;
	Figure(int l,int  b)
	{
		this.l = l;
		this.b = b;
	}
	abstract int area(); 
}
class Rectangle extends Figure
{
	Rectangle(int a,int b)
	{
		super(a,b);
	}
	int area()
	{
		return (l*b);
	}
}