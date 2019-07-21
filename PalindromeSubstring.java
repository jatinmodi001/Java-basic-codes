import java.util.Scanner;
class PalindromeSubstring
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String temp = new String();
		String temp1 = new String();
		String str = new String();
		str = scan.next();
		int k;
		for(int i=0;i<str.length();i++)
		{
			k = i;
			for(int j=0;j<str.length();j++)
			{
				if(k+1<=str.length())
					temp = str.substring(j,k+1);
				else
					break;
				for(int t = temp.length()-1;t>=0;t--)
				{
					temp1 += temp.charAt(t);
				}
				if(temp1.equals(temp))
				{
					System.out.println(temp);
				}
				temp1 = "";
				temp = "";
				k++;
			}
		}

	}
}