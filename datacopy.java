import java .io.*;
import java.io.IOException;
class datacopy
{
	public static void main(String[] args) throws IOException 
	{
		BufferedWriter bw=new BufferedWriter(new FileWriter("file1"));
		bw.write ("this is a file and my name is pushkar");
		bw.close();
		InputStream in=new FileInputStream(new File("file1"));
		OutputStream out=new FileOutputStream(new File("file 2"));
		byte[] buf=new byte[1024];
		int len;
		while((len=in.read(buf))>0)
		{
			out.write(buf,0,len);
		}
		in.close();
		out.close();
	}
}