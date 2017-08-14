import java.io.*;

public class FileStream  {

	File file = new File("emailpass.txt");
	
	private void go() throws IOException {
		FileWriter fw = new FileWriter(file);
		fw.write("Everything is OK");
		fw.flush();
		fw.close();
	}
	
}
