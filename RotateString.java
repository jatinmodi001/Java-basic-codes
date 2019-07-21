import java.util.Scanner;
class RotateString
{
	public static void main(String[] args) 
	{
		System.out.println("Enter String");
		String str = new String();
		Scanner scan =new Scanner(System.in);
		str = scan.next();
		System.out.println("Enter the number of rotations");
		int n;
		n = scan.nextInt();
		System.out.println("Rotations");
		while(n!=0)
		{
			String rev = rotation(str);
			System.out.println(rev);
			str = rev;
			n--;
		}
	}
	static String rotation(String str)
	{
		String temp = new String();
		temp += str.charAt(str.length()-1);
		for(int i=0;i<str.length()-1;i++)
		{
			temp += str.charAt(i);
		}
		return temp;
	}
}