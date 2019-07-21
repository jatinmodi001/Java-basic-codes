class Implement2
{
	public static void main(String[] args) 
	{
		Shape obj = new Shape(50,45);
		System.out.println("Area of circle = " + obj.CircleArea());
		System.out.println("Perimeter of circle = " + obj.CirclePerimeter());
		System.out.println("Area of Square = " + obj.SquareArea());
		System.out.print("Perimeter of Square = " + obj.SquarePerimeter());
	}
}
interface Circle
{
	double CircleArea();
	double CirclePerimeter();
}
interface Square
{
	double SquareArea();
	double SquarePerimeter();
}
class Shape implements Circle, Square
{
	int radius,side;
	Shape(int radius,int side)
	{
		this.radius = radius;
		this.side = side;
	}
	public double CircleArea()
	{
		return (double)(3.141*radius*radius);
	}
	public double CirclePerimeter()
	{
		return (double)(2 * 3.141 * radius);
	}
	public double SquareArea()
	{
		return (double)(side * side);
	}
	public double SquarePerimeter()
	{
		return (double)(4 * side);
	}
}