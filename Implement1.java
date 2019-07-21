class Implement1
{
	public static void main(String[] args) 
	{
		IArea obj;
		obj = new Csquare(5);
		System.out.println("Area if square = " + obj.sArea());
		obj = new Carea(4);
		System.out.print("Area of circle = " + obj.cArea());
	}
}
interface IArea 
{
	int sArea();
	double cArea();
}
class Csquare implements IArea
{
	int s;
	Csquare(int s)
	{
		this.s = s;
	}
	public int sArea()
	{
		return s*s;
	}
	public double cArea()
	{
		return 0;
	}
}
class Carea implements IArea
{
	int r;
	Carea(int r)
	{
		this.r = r;
	}
	public int sArea()
	{
		return 0;
	}
	public double cArea()
	{
		return (double)(3.141*r*r);
	}
}