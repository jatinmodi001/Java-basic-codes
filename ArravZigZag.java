import java.util.Scanner;
class ArravZigZag
{
	public static void main(String[] args) 
	{
		int r,c,i=0,j=0;
		Scanner scan = new Scanner(System.in);
		r = scan.nextInt();
		c = scan.nextInt();
		int []arr[] = new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");;
			}
			System.out.println();
		}
		int dir = 1;
		for(i=0;i<r;i++)
		{	
			if(dir == 1)
			{
				for(j=0;j<c;j++)
				{
					System.out.println(arr[i][j]);
					dir = 0;
				}
			}
			else if(dir == 0)
			{
				for(j=c-1;j>=0;j--)
				{
					System.out.println(arr[i][j]);
				}
				dir = 1;
			}
		}
	}
}