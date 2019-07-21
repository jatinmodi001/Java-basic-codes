class RateAbstract
{
	public static void main(String[] args) 
	{
		Rate12 a = new Rate12(40000,5);
		System.out.println(a.finalinterest());
		/*a = new Rate10(30000,6);
		System.out.println(a.finalinterest());
		a = new Rate8(41000,8);
		System.out.println(a.finalinterest());*/
	}
}
abstract class Interest
{
	int p,t;
	Interest(int p,int t)
	{
		this.p = p;
		this.t = t;
	}
	//abstract float finalinterest();
}
class Rate12 extends Interest
{
	Rate12(int p,int t)
	{
		super(p,t);
	}
	float finalinterest()
	{
		return (float)(p*t*12/100);
	}
}
class Rate10 extends Interest
{
	Rate10(int p,int t)
	{
		super(p,t);
	}
	float finalinterest()
	{
		return (float)(p*t*10/100);
	}
}
class Rate8 extends Interest
{
	Rate8(int p,int t)
	{
		super(p,t);
	}
	float finalinterest()
	{
		return (float)(p*t*18/100);
	}
}