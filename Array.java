import java.util.Scanner;
class array
{
	public static void main(String[] arg)
	{
		int size;
		System.out.println("Enter the size of array");
		Scanner scan = new Scanner(System.in);
		size = scan.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements");
		for(int i = 0;i<size;i++)
		{
			arr[i] = scan.nextInt();
		}
		scan.close();
		for(int i = 0;i<size;i++)
		{
			System.out.println(i+1+". "+arr[i]);
		}
	}
} 