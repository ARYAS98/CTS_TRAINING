import java.io.*;
public class FileExample
{
	public static void main(String args[])
	{
		try
		{
			File f=new File("D:\\Arya Training\\javapgm\\nnew.java");
			FileReader fin=new FileReader(new File("D:\\Arya Training\\javapgm\\ghj.java"));
			FileWriter fout=new FileWriter(f);
			int i=0;
			while((i=fin.read())!=-1)
			{
				fout.write(i);
			}
			fout.close();
			fin.close();
		}
		catch(Exception e)
		{
		}
	}
}
