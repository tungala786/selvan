package inputoutput;
import java.io.*;
public class FileOutputstreamExample {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("E:\\mahesh.txt");
		
		String s="Hello,everybody,this is mahesh from Qaplanet!";
		
		byte b[] = s.getBytes();
		
		fout.write(b);
		
		fout.close();

	}

}
