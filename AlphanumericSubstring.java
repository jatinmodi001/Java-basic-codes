import java.util.Scanner;
class AlphanumericSubstring
{
	public static void main(String[] args) 
	{
		String str = new String();
		String temp = new String();
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		for(int i=0;i<str.length();i++)
		{
			int k = i;
			for(int j=0;j<str.length();j++)
			{
				if(k+1 <= str.length())
				{
					boolean flag = true;
					temp = str.substring(j,k+1);
					if((temp.charAt(0)>='a' && temp.charAt(0)<='z') || (temp.charAt(0)>='A' && temp.charAt(0)<='Z'))
					{
						for(int a = 1;a<temp.length();a++)
						{
							if((temp.charAt(a)>='a' && temp.charAt(a)<='z') || (temp.charAt(a)>='A' && temp.charAt(a)<='Z'))
								continue;
							else
							{
								flag = false;
								break;
							}
						}
					}
					else if((temp.charAt(0)>='0' && temp.charAt(0)<='9'))
					{
						for(int a = 1;a<temp.length();a++)
						{
							if((temp.charAt(a)<'0' || temp.charAt(a)>'9'))
							{
								flag = false;
								break;
							}
						}
					}
					else
					{
						flag = false;
						break;
					}
					if(flag)
					{
						System.out.println(temp);
					}
				}
				k++;
			}
		}		
	}
}