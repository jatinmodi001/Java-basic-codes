import java.util.Scanner;
public class StrongNumber
{
	public static void main(String[] args) {
		int a;
		Scanner scan;
		scan= new Scanner(System.in);
		System.out.println("Enter anumber:- ");
		a=scan.nextInt();
		boolean x=find_fact(a,a,1,0);
		if(x)
		{
			System.out.print("No. is strong");
		}
		else
		{
			System.out.print("No. is not strong");
		}
	}
	public static boolean find_fact(int a,int b,int fact,int sum)
	{		
		if(sum==b && a==0)
		{
			return true;
		}
		if(sum!=b && a==0)
		{
			return false;
		}
		int rem=a%10;
		while(rem!=0)
		{
			fact=fact*rem;
			rem--;
		}
		sum=sum+fact;
		return find_fact(a/10,b,1,sum);
	}
}