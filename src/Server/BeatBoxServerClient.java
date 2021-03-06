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
		reader.close();
		
		File file = new File("dialog.txt"); 
		PrintWriter printWriter = new PrintWriter(file);
		BufferedWriter writer = new BufferedWriter(printWriter);
		writer.write(message); // занотовую повідомлення
		writer.newLine();      // перехід на нову строку
		System.out.println(message);
		
		writer.flush();
		writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
