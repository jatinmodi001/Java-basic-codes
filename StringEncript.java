import java.util.Scanner;
class StringEncript
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String str = new String();
		String result = new String();
		str = scan.next();
		for(int i = 0 ; i < str.length() ; i++)
		{
			int ct=0;
			boolean flag = true;
			for(int j = i-1 ; j>=0;j--)
			{
				if(str.charAt(j) == str.charAt(i))
				{
					flag = false;
					break;
				}
			}
			for(int j=i;j<str.length();j++)
			{
				if((str.charAt(i) == str.charAt(j)) && flag)
					ct++;
			}
			if(ct!=0)
			{
				result += str.charAt(i);
				result += ct;
			}
		}
		System.out.print(result);
	}
}