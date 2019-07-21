import java.util.Scanner;
class CountWords
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = new String();
		str = scan.nextLine();
		int ct = 0,j;
		for(int i =0;i<str.length()-1;i++)
		{
			if(str.charAt(i)!=' ')
			{
				for(j=i;j<str.length();j++)
				{
					if(str.charAt(j)==' ')
						break;
				}
				i = j;
				ct++;
			}
		}
		System.out.print("Number of words are : " + ct);
	}
}