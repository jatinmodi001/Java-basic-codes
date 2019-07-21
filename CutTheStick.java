import java.util.Scanner;
class CutTheStick
{
	public static void main(String[] args) 
	{
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		System.out.println("Enter length of sticks");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		int ct = 0;
		int min = 999999;
		while(true)
		{
			for(int i=0;i<n;i++)
			{
				if(arr[i]<min && arr[i]!=0)
				{
					min = arr[i];
				}
			}
			for(int j=0;j<n;j++)
			{
				if(arr[j]!=0)
				{
					arr[j] -= min;
					ct++;
				}
			}
			if(ct == 0)
				break;
			System.out.print(ct + " ");
			min = 99999;
			ct  = 0;
		}

	}
}