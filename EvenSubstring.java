import java.util.Scanner;
class EvenSubstring
{
	public static void main(String[] args)
	{
		String str = new String();
		String temp = new String();
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		int ct = 1;
		int ct1 = 0;
		int flag = 0;
		while(ct<str.length())
		{
			for(int i=0;i<str.length();i++)
			{
				ct1=0;
				flag = 0;
				for(int j=i;j<str.length();j++)
				{
					temp += str.charAt(j);
					if(ct1==ct)
					{
						
						flag = 1;
						break;
					}
					ct1++;
				}
				if(temp.length()%2==0 && flag == 1)
				{
					System.out.println(temp);
				}
				temp = "";
			}
			ct++;
		}
	}
}