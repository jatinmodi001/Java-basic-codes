import java.util.Scanner;
class SwapFirstAndLastCharacterInString
{
	public static void main(String[] args)
	{
		String temp = new String();
		String res = new String();
		String str = new String();
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		int j;
		for(int i=0;i<str.length();i++)
		{
			temp = "";
			if(str.charAt(i)==' ')
			{
				res += str.charAt(i);
				continue;
			}
			for(j=i;j<str.length();j++)
			{
				if(str.charAt(j)==' ')
				{
					i = j;
					break;
				}
				temp += str.charAt(j);
				i=j;
			}
			if(temp.length()!=1 && temp.length()!=0)
			{
				res += temp.charAt(temp.length()-1);
				for(j=1;j<temp.length()-1;j++)
					res += temp.charAt(j);
			}
			res += temp.charAt(0);
			Sres += ' ';
		}
		System.out.print(res);
	}
}