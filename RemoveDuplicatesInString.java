package yo;
import java.util.Scanner;
class RemoveDuplicatesInString
{
	public static void main(String[] args)
	{
		String str = new String();
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		StringBuilder sb = new StringBuilder(str);
		for(int i=0;i<str.length();i++)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					sb.delete(j);
				}
			}
		}
		System.out.print(sb);
	}
}