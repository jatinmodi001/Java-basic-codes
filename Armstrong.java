import java.util.Scanner;
public class Armstrong
{
	public static void main(String[] args) 
	{
		int a;
		System.out.println("Enter a number");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		int ct=CountDigits(a,0);
		System.out.println("Count = "+ct);
		boolean x = CheckArmstrong(a,a,ct,0);
		if(x)
		{
			System.out.print("Number is Armstrong");
		}
		else
		{
			System.out.print("Number is not Armstrong");
		}
	}
	public static int CountDigits(int a,int ct)
	{
		if(a==0)
			return ct;
		else
		{
			return CountDigits(a/10,++ct);
		}
	}
	public static boolean CheckArmstrong(int a ,int b,int ct,int sum)
	{
		if(sum==b &&a==0)
			return true;
		if(sum!=b && a==0)
		{
			return false;
		}
		else
		{
			int rem=a%10;
			int c=rem;
			for(int i=0;i<ct-1;i++)
			{
				rem *= c;
			}
			sum += rem;
			return CheckArmstrong(a/10,b,ct,sum);
		}
	}
}