package Server;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.*;
import java.net.*;

class BeatBoxServerClient implements Runnable {
	Socket socket;
	public BeatBoxServerClient(Socket socket) {
		this.socket = socket;
	}

	String message;	
	
	@Override
	public void run() {
		try {
		InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
		BufferedReader reader = new BufferedReader(streamReader); 
		message = reader.readLine();
		
		File file = new File("dialog.txt"); 
		PrintWriter writer = new PrintWriter(file);
		writer.println(message); // занотовую повідомлення
		
		System.out.println(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
