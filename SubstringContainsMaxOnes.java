import java.util.Scanner;
class SubstringContainsMaxOnes
{
	public static void main(String[] args) 
	{
		String str = new String();
		String res = new String();
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		int ct = 0;
		int max = -1;
		for(int i=0;i<str.length();i++)
		{
			int k = i;
			boolean flag = false;
			for(int j=0;j<str.length();j++)
			{
				ct = 0;
				if(k+1<=str.length())
				{
					String sub = str.substring(j,k+1);
					for(int l = 0;l<sub.length();l++)
					{
						if(sub.charAt(l)=='1')
						{
							ct++;
						}
						else
							break;
					}
					if(ct>max)
					{
						max = ct;
						res = sub;
					}
				}
				k++;
			}
		}
		System.out.print(res);		
	}
}