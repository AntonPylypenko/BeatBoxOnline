package Server;

import java.io.*;
import java.net.*;

public class BeatBoxClient {

	public BeatBoxClient(String text) {
		try {
			Socket socket = new Socket("127.0.0.1", 5555);
			PrintWriter print = new PrintWriter(socket.getOutputStream());
			BufferedWriter writer = new BufferedWriter(print);
			writer.write(text);
			writer.flush();
			writer.close();
		}catch(IOException e) {
			System.out.println("Output problem(");
		}
	}
}
