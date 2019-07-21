import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args) 
	{
		int a;
		System.out.println("Enter a number to check palindrome :- ");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		int rev=FindPalindrome(a,0);
		if(rev==a)
		{
			System.out.print("Number is palindrome");
		}
		else
		{
			System.out.print("Number is not palindrome");
		}
	}
	public static int FindPalindrome(int a,int rev)
	{
		if(a==0)
			return rev;
		else
		{
			int rem=a%10;
			rev=rev*10+rem;
			return FindPalindrome(a/10,rev);
		}
	}
}