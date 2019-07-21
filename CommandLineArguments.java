import java.lang.String;
public class CommandLineArguments
{
	public static void main(String[] args) 
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.printf("%s %s",args[0],args[1]);	
	}
}