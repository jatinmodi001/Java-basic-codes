import java.util.Scanner;
class PalindromeString2
{
	public static void main(String[] args)
	{
		String str = new String();
		Scanner scan = new Scanner(System.in);
		String str2 = new String();
		str = scan.next();
		for(int i=str.length()-1;i>=0;i--)
		{
			str2 += str.charAt(i);
		}
		if(str.equals(str2))
		{
			System.out.print("String is palindrome");
		}
		else
		{
			System.out.print("String is not palindrome");
		}
	}
}