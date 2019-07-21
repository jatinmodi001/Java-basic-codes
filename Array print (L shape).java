import java.util.Scanner;
class ArrayL
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(Sytem.in);
		int r,c,i,j;
		r = scan.nextInt();
		c = scan.nextInt();
		int arr[][] = new int[r][c];
		for(i=0;i<r;i++)
		{
			int  k =i;
			for(j=0;j<c;j++)
			{
				System.out.print(arr[k][j]);
				if(k==0 || j==c-1)
				{
					System.out.println();
				}
				k--;
			}
		}
	}
}