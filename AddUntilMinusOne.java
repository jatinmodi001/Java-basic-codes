import java.util.Scanner;
class AddUntilMinusOne
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
		int sum = 0;
		int index = 0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==-1)
				break;
			
			if(arr[i+1]==-1)
			{
				arr[index] = sum;
				arr[i] = sum;
				System.out.println(arr[index] + " at " +index+" " +arr[i]+" at "+(i));
				index ++;
				i = index+1;
				
			}
			else
				sum = arr[index] + arr[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}