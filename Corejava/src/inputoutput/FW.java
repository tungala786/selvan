package inputoutput;
import java.io.*;
public class FW {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("E:\\mahesh.doc");
       
		fw.write("Selenium is a test automation tool!");
        
        fw.close();
	}

}
