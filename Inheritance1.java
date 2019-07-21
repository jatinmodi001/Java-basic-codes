import java.util.Scanner;
class Inheritance1
{
	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle();
		r.getData();
		Square s = new Square();
		s.getData();
		Circle c = new Circle();
		c.getData();
		System.out.println("Rectange area :- "r.getAreaR(r.x,r.y));
		System.out.println("Square area :- "s.getAreaS(s.side));
		System.out.print("Circle area :- "c.getAreaC(c.r));
	}
}
class Area
{
	int area;
	int getAreaS(int side)
	{
		return (side*side);
	}
	int getAreaR(int x,int y)
	{
		return (x*y);
	}
	float getAreaC(int r)
	{
		return(float)(3.141*r*r);
	}
}
class Rectangle extends Area
{
	int x,y;
	void getData()
	{
		Scanner scan = new Scanner(System.in);
		this.x = scan.nextInt();
		this.y = scan.nextInt();
	}
}
class Square extends Area
{
	int side;
	void getData()
	{
		Scanner scan = new Scanner(System.in);
		side = scan.nextInt();
	}
}
class Circle extends Area
{
	int r;
	void getData()
	{
		Scanner scan = new Scanner(System.in);
		r = scan.nextInt();
	}
}