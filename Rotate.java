//Rotate the elements.
import java.util.Scanner;
public class Rotate
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number of elements");
		int a;
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter the elements");
		for(int i=0;i<a;i++)
		{
			arr[i] = scan.nextInt();
		}
		int j=0;
		System.out.println("Enter the number of ratations");
		int rot = scan.nextInt();
		for(int i=0;i<rot;i++)
		{
			int temp;
			temp=arr[a-1];
			for(j=a-1;j>0;j--)
			{
				arr[j] = arr[j-1];	
			}
			arr[0]=temp;
			for(int k=0;k<a;k++)
			{
				System.out.print(arr[k]+" ");
			}
			System.out.println("\n");
		}
		
	}
}