import java.util.Scanner;
public class Reverse_of_number
{
	public static void main(String[] args) 
	{
		int a;
		System.out.print("Enter a number :- ");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		scan.close();
		int rev=reverse(a,0);
		System.out.print("Reverse of above number is:- "+rev);
	}
	public static int reverse(int a,int rev)
	{
		if(a==0)
		{
			return rev;
		}
		else
		{
			int rem=a%10;
			rev=rev*10+rem;
			return reverse(a/10,rev);
		}
	}
}