import java.util.Scanner;
public class Pattern2
{
	public static void main(String[] args)
	{
		int a;
		System.out.println("Enter the number of rows for the pattern:-");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		for(int i=a-1;i>=0;i--)
		{
			for(int j=i;j>=0;j--)
			{
				System.out.print("#");
			}
			if(i!=0)
			System.out.println();
		}
	}
}