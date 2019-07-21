import java.util.Scanner;
public class KthPrime
{
	public static void main(String[] args)
	{
		int a;
		System.out.println("Enter a number :-");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		int ct=Kprime(2,a,2,1);
		System.out.print(ct);
	}
	public static int Kprime(int b,int a,int i,int ct)
	{
		if(ct==a)
		{
			return b;
		}
		if(b%i==0 && i<b)
		{
			return Kprime(b+1,a,2,ct);
		}
		else if(b%i!=0 && i<b)
		{
			if(i==b-1)
			{
				ct++;
			}
			return Kprime(b,a,i+1,ct);
		}
		else
		{
			return Kprime(b+1,a,2,ct);
		}
	}
}