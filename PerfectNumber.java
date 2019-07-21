import java.util.Scanner;
public class PerfectNumber
{
	public static void main(String[] args) 
	{
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		a=scan.nextInt();
		boolean x =perfect(a,a,2,0);
		if(x)
		{
			System.out.print("Perfect");
		}
		else
		{
			System.out.println("Not Perfect");
		}
	}
	public static boolean perfect(int a,int b,int i,int sum)
	{
		if(sum+1==b)
		{
			return true;
		}
		else if(sum+1!=b && i>=a)
		{
			return false;
		}	
		if(a%i==0 && i<a)
		{
			sum=sum+i;
			return perfect(a,b,i+1,sum);
		}
		else
		{
			return perfect(a,b,i+1,sum);
		}
	}
}