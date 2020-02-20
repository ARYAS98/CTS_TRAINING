import java.io.*;
public class Teest
{
	public static void main(String args[]) throws Exception
	{
		String s="D:\\Arya Training\\javapgm\\basic_java\\src\\pw1.java";
		String s1="D:\\Arya Training\\javapgm\\basic_java\\src\\pw2.java";
		int i;
		//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter());
		FileInputStream fis=new FileInputStream(s1);
		FileOutputStream bw=new FileOutputStream(s,false);
		fis.skip(3);
		while((i=fis.read())!=-1)
		{
			bw.flush();
			bw.write(i);
		}
		bw.close();
		fis.close();
	}
}
