import java.util.Scanner;
public class Pattern1
{
	public static void main(String[] args) 
	{
		int a;
		System.out.println("Enter the number of rows you want to print:-");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		/*for(int i=0;i<a;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("#");
				if(j==i && i!=a-1)
				{
					System.out.println();
				}
			}
		}*/
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("#");
			}
			if(i!=a-1)
			System.out.println();
		}
	}
}