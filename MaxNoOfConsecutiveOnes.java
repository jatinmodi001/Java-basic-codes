import java.util.Scanner;
class MaxNoOfConsecutiveOnes
{
	public static void main(String[] args) 
	{
		String str = new String();
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		for(int i=0;i<str.length();i++)
		{
			int k = i;
			for(int j=0;j<str.length();j++)
			{
				if(k+1 <= str.length())
				{
					String sub = str.substring(j,k+1);
					
				}
				k++;
			}
		}
	}
}