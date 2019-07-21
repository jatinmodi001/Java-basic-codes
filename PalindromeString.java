import java.util.Scanner;
public class PalindromeString
{
	public static void main(String[] args) 
	{
		int ct=0;
		String a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		String b="";
		String c="";
		int i;
		for(i=0;a.charAt(i)!=EOL;i++)
		{
			
			if(a.charAt(i)==' ')
			{
				for(int l=b.length()-1;l>=0;l--)
				{
					c = c+b.charAt(l);
					//l--;
				}
				if(c.equals(b))
				{
					ct++;
					
				}
				c="";
				b="";
			}
			else
			{
				b=b+a.charAt(i);
				//j++;
			}	
		}
		System.out.println(ct);		
		
	}
}