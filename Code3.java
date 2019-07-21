package pattern;

import java.util.Scanner;

public class Code3 
{
	public static void main(String[] args)
	{
		System.out.println("Enter any odd number");
		int n;
		int half;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		scan.close();
		half=n/2;
		for(int i=0;i<n;i++)
		{
			if(i==half)
			{
				for(int k=0;k<n;k++)
				{
					System.out.print("*");
				}
			}
			else
			for(int j=0;j<n;j++)
			{
				
				if(j==half || j==i+half || j==half-i || j==i-half || j==n+half-i-1)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}