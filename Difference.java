import java.util.Scanner;
class Difference
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
		int diff = 9999999;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if((arr[i] - arr[j])<diff)
				{
					if(arr[i] - arr[j] < 0)
					{
						diff = arr[j] - arr[i];
					}
					else
					{
						diff = arr[i] - arr[j];
					}
				}
			}
		}
		System.out.print(diff);		
	}
}