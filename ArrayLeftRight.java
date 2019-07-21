import java.util.Scanner;
class ArrayLeftRight
{
	public static void main(String[] args) 
	{
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		int left = 0,right = 0;
		for(int i=0;i<n;i++)
		{
			if(i!=0)
			{
				left = arr[i-1];
			}
			if(i<n-1)
			{
				right = arr[i+1];
			}
			System.out.print(left+right+" ");
			left = 0;
			right = 0;
		}
	}
}