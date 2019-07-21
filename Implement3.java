class Implement3
{
	public static void main(String[] args) 
	{
		Square obj = new Square(10);
		System.out.println("Area = " + obj.Area());
		System.out.print("Perimeter = " + obj.Perimeter());
	}
}
interface A
{
	int Area();
}
interface B extends A
{
	int Perimeter();
}
class Square implements B
{
	int side;
	Square(int side)
	{
		this.side = side;
	}
	public int Area()
	{
		return side * side;
	}
	public int Perimeter()
	{
		return 4 * side;
	}
}