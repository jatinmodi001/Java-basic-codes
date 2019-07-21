import java.util.Scanner;
public class ArraySort2D
{
	public static void main(String[] args)
	{
		int l=0,m=0;
		int r=0,c=0,i=0,j=0,min=0,k=0,temp=0,n=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns :-");
		r=scan.nextInt();
		c=scan.nextInt();
		int a[][] = new int[r][c];
		System.out.print("Enter elements\n");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Elements before sorting:-");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		min=999999;
		while(true)
		{
			min=999999;
			j=n;
			for(i=k;i<r;i++)
			{
				for(j=j;j<c;j++)
				{
					if(min>a[i][j])
					{
						min=a[i][j];
						l=i;
						m=j;
					}
				}
				j=0;
			}
			temp=a[l][m];
			a[l][m]=a[k][n];
			a[k][n]=temp;
			n++;
			if(n==c && k==r-1)
				break;
			if(n==c)
			{
				n=0;
				k++;
			}
			if(k==r)
			{
				k=0;
			}	
		}
		System.out.println("Elements after sorting:-");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}