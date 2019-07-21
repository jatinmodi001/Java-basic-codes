import java.util.Scanner;
public class PalindromicPrimeNumber
{
	public static void main(String[] args) 
	{
		int a;
		System.out.println("Enter a number:- ");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		int rev=palindrome(a,0);
		boolean x=prime(a,2);
		if(rev==a && x)
		{
			System.out.println("Number is Palindromic Prime Number");
		}
		else
		{
			System.out.print("Number is not Palindromic Prime Number");
		}		
	}
	public static int palindrome(int a,int rev)
	{
		if(a==0)
			return rev;
		else
		{
			int rem=a%10;
			rev=rev*10+rem;
			return (palindrome(a/10,rev));
		}
	}
	public static boolean prime(int a,int i)
	{
		if(a%i==0 && i<a/2)
		{
			return false;
		}
		else if(a%i!=0 && i<a/2)
		{
			return prime(a,i+1);
		}
		else
		{
			return true;
		}
	}
}