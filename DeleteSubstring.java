import java.util.Scanner;
class DeleteSubstring
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String str = new String();
		str = scan.nextLine();
		String sub = new String();
		sub = scan.next();
		String res = new String();
		int j=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == sub.charAt(j))
			{
				j++;
				if(j == sub.length())
				{
					res += ' ';
					j=0;
				}
			}
			else
			{
				j = 0;
				res += str.charAt(i);
			}
		}
		res = res.trim();
		System.out.print(res);
	}
}