import java.util.Scanner;
class VowelSubstring
{
	public static void main(String[] args) 
	{
		String str = new String();
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		int ct = 0,ct1 = 0;
		int count_vowel = 0;
		String temp = new String();
		while(ct!=str.length())
		{
			for(int i=0;i<str.length();i++)
			{
				ct1=0;
				for(int j=i;j<str.length();j++)
				{
					temp += str.charAt(j);
					if(str.charAt(j)=='a' ||str.charAt(j)=='e' ||str.charAt(j)=='i' ||str.charAt(j)=='o' ||str.charAt(j)=='u' )
					{
						count_vowel ++ ;
					}
					if(ct1 == ct)
						break;
					ct1++;
				}
				
				if(temp.length()==ct+1)
				{
					System.out.println(temp + "-->" +count_vowel);

				}
				temp = "";
				count_vowel = 0;
			}
			ct++;
		}
	}
}