//Pairs whose sum is 5
import java.util.Scanner;
public class Sum5
{
	public static void main(String[] args) 
	{
		int n;
		int b=0;
		System.out.println("Enter the number of elemtents");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		int l=0;
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		int i=0;
		int j=0;
		int flag=0;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				l=0;
				if(arr[i]+arr[j]==10)
				{
					flag=0;
					int flagg=0;
					for(int k=0;k<n;k++)
					{
						if(arr[i]==arr1[k] || arr[i]==arr2[k])
						{
							flag=1;
							break;
						}	
					}
					for(int k=0;k<n;k++)
					{
						if(arr[j]==arr2[k] || arr[j]==arr1[k])
						{
							flagg=1;
							break;
						}
					}
					
					if(flag==0 || flagg==0)
						System.out.println(arr[i]+" + "+arr[j]+" = 10");
					arr1[b]=arr[i];
					arr2[l]=arr[j];
				}
				l++;
			}
			b++;
		}				
	}
}