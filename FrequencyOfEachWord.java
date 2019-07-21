import java.util.Scanner;
class FrequencyOfEachWord
{
	public static void main(String[] args)
	{
		String str = new String();
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		for(int i=0;i<str.length();i++)
		{
			int ct = 0;
			boolean flag = true;
			if(str.charAt(i)!=' ')
			{
				for(int j=i-1;j>=0;j--)
				{
					if(str.charAt(i)==str.charAt(j))
					{
						flag = false;
						break;
					}
				}
				if(flag)
				{
					for(int j=i;j<str.length();j++)
					{
						if(str.charAt(i)==str.charAt(j))
							ct++;
					}
				}
			}
			if(ct!=0)
			System.out.println(str.charAt(i) + " arrives " + ct);
		}
	}
}