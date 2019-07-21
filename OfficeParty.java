import java.util.Scanner;
public class OfficeParty
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
		int k=0;
		int arr2[] = new int[n];
		for(int i=0;i<n;i++)
		{
			int flag = 0;
			for(int j=0;j<i;j++)
			{
				if(arr[i] == arr[j])
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				arr2[k] = arr[i];
				k++;
			}
		}
		for(int i=0;i<k;i++)
		{
			System.out.print(arr2[i] + " ");
		}
		int m ;
		m = scan.nextInt();
	}
}