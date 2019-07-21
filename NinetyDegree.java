import java.util.Scanner;
public class NinetyDegree
{
	public static void main(String[] args)
	{
		int r,c;
		Scanner scan;
		scan=new Scanner(System.in);
		//r=scan.nextInt();
		r=scan.nextInt();
		c=scan.nextInt();
		int arr[][] = new int[r][c];
		int arr1[][] = new int[c][r];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr1[j][i]=arr[i][j];
			}
		}
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
		