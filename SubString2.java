import java.util.Scanner;
class SubString2
{
	public static void main(String[] args)
	{
		String temp = new String();
		String str = new String();
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		for(int i=0;i<str.length();i++)
		{
			int k = i;
			for(int j=0;j<str.length();j++)
			{
				if(k+1<=str.length())
				{
					//temp = str.substring(j,k+1);
					for(int t=j;t<k+1;t++)
					{
						temp += str.charAt(t);
					}
					System.out.println(temp);
					temp="";
				}
				else
					break;
				k++;
			}
		}
	}
}