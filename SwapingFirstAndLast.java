import java.util.Scanner;
public class SwapingFirstAndLast
{
	public static void main(String[] args) 
	{
		int a;
		System.out.println("Enter a number :-");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		int ct=CountElements(a,0);
		int NewNumber=Swapper(a,a);
		System.out.print("After swaping first and last number,New number is:- "+NewNumber);
	}
	public static int CountElements(int a,int ct)
	{
		if(a==0)
		{
			return ct;
		}
		else
		{
			ct++;
			return CountElements(a/10,ct);
		}
	}
	public static int Swapper(int a,int b)
	{
		int ct=0;
		int last=a%10;
		int first=0;
		while(a!=0)
		{
			first=a%10;
			ct++;
			a /= 10;
		}
		int c = first;
		for(int i=0;i<ct-2;i++)
		{
			last=last*10;
		}
		int minus=b/10;
		last += minus;
		for(int i=0;i<ct-2;i++)
		{
			first=first*10;
		}
		last -= first;
		last *= 10;
		last += c;
		return last;
	}
}