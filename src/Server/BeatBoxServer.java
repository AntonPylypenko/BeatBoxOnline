package Server;
import java.io.*;
import java.net.*;

public class BeatBoxServer{
	
	public static void main (String[] arg) {
		try {
			ServerSocket serverSock = new ServerSocket(5555);
			while(true) {
				Socket socket = serverSock.accept();
				Runnable bbServerClient = new BeatBoxServerClient(socket);
				Thread sockThread = new Thread(bbServerClient);
				sockThread.start();
			}
		}catch(IOException e) {
			System.out.println("ServerSocket problem!");
		}
	}
}
