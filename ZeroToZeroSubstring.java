import java.util.Scanner;
class ZeroToZeroSubstring
{
	public static void main(String[] args) 
	{
		int ct = 0,ct1 = 0;
		String str = new String();
		String temp = new String();
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		while(ct!=str.length())
		{
			for(int i=0;i<str.length();i++)
			{
				ct1 = 0;
				for(int j = i;j<str.length();j++)
				{
					temp += str.charAt(j);
					if(ct1 == ct)
						break;
					ct1++;
				}
				if(temp.length()==ct+1 && temp.charAt(0)=='0' && temp.charAt(temp.length()-1)=='0')
				{
					System.out.println(temp);
				}
				temp = "";
			}
			ct++;
		}
	}
}