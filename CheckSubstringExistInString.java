import java.util.Scanner;
class CheckSubstringExistInString
{
	public static void main(String[] args)
	{
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		String str = new String();
		String str1 = new String();
		System.out.println("Enter main String");
		str = scan.nextLine();
		System.out.println("Enter substring");
		str1 = scan.nextLine();
		for(int i=0;i<str.length();i++)
		{
			flag = true;
			for(int j=0;j<str1.length();j++)
			{
				if(str1.charAt(j)!=str.charAt(i))
				{
					flag = false;
					break;
				}
				i++;
			}
			if(flag)
			{
				System.out.print("Yes, Substring is part of main string");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("No, Substring is not part of main String");
		}
	}
}