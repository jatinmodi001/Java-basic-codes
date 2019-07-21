import java.util.Scanner;
class PrintWordsInAscending
{
	public static void main(String[] args)
	{
		String str = new String();
		String temp = new String();
		int ct = 0;
		String[] strarr = new String[100];
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		int k=0;
		for(int i=0;i<str.length();i++)
		{
			temp="";
			for(int j=i;j<str.length();j++)
			{
				i = j;
				if(str.charAt(j)==' ')
				{
					break;
				}
				temp += str.charAt(j);
			}
			strarr[k] = temp;
			ct++;
			k++;
		}
		for(int p=0;p<ct-1;p++)
		{
			for(int i=0;i<ct-p-1;i++)
			{
				if(strarr[i].compareTo(strarr[i+1])>0)
				{
					String str1 = strarr[i+1];
					strarr[i+1] = strarr[i];
					strarr[i] = str1;
				}
			}
		}
		for(int i=0;i<ct;i++)
		{
			System.out.println(strarr[i]);
		}
	}
}