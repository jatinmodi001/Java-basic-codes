import java.util.*;
class Permutation
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = new String();
		str = scan.next();
		String str2 = new String();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				str2 += str.charAt(i);
			}
			if(str2.length()==str.length())
			{
				System.out.println(str2);
				str2="";
				continue;
			}

		}
	}
}