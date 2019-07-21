import java.util.Scanner;
public class AddOneToEachDigit
{
	public static void main(String[] args)
	{
		int a;
		System.out.println("Enter a number :-");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		int ct = CountDigits(a,0);
		int add = NumberOfOnes(a,0,0,1,0,ct);
		a=a+add;
		System.out.print("After adding one to each digit:- "+a);
	}
	public static int CountDigits(int a,int ct)
	{
		if(a==0)
		{
			return ct;
		}
		else
		{
			ct++;
			return CountDigits(a/10,ct);
		}
	}
	public static int NumberOfOnes(int a,int i,int j,int num,int num2,int ct)
	{
		if(i==ct)
		{
			return num2/10;
		}
		if(j==ct && i!=ct)
		{
			i++;
			num2=num2+num;
			num=1;
			return NumberOfOnes(a,i,i,num,num2,ct);
		}
		else
		{
			num = num*10;
			return NumberOfOnes(a,i,j+1,num,num2,ct);
		}
	}
}