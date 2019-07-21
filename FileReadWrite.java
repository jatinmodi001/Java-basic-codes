import java.io.*;
class FileReadWrite
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\jatin\\Desktop\\test qstn.txt");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\jatin\\Desktop\\test qstn2.txt");
			int i=0;
			while((i = fis.read()) != -1)
			{
				fos.write((char)i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}