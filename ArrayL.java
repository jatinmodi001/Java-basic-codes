import java.util.Scanner;
class ArrayL
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int r,c,i,j;
		r = scan.nextInt();
		c = scan.nextInt();
		int arr[][] = new int[r][c];
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
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(i=0;i<r;i++)
		{
			int  k =i;
			for(j=0;j<c;j++)
			{
				System.out.print(arr[k][j]+" ");
				if(k==0)
				{
					System.out.println();
					break;
				}
				k--;	
			}
		}
		for(j=1;j<c;j++)
		{
			int k=j;
			for(i=r-1;i>=0;i--)
			{
				System.out.print(arr[i][k]+" ");
				if(k==c-1)
				{
					System.out.println();
					break;
				}
				k++;
			}
		}
	}
}