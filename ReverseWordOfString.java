import java.util.Scanner;
class ReverseWordOfString
{
	public static void main(String[] args) 
	{
		String str = new String();
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		String reverse = new String();
		for(int i=0;i<str.length();i++)
		{
 			if(i==str.length()-1 || str.charAt(i+1)==' ' )
			{
				for(int j=i ; j>=0;j--)
				{
					if(str.charAt(j)==' ')
						break;
					reverse += str.charAt(j);
				}
				reverse += ' ';
			}
		}
		System.out.print(reverse);
	}
}