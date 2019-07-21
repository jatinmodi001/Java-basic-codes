import java.io.*;
class file
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\jatin\\Desktop\\test qstn.txt");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\jatin\\Desktop\\test qstn.txt");
			int i = fis.read();
			System.out.println((char)i);
			fos.write();
			fis.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}