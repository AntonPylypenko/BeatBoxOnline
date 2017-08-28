package Server;
import java.io.IOException;
import java.net.*;

public class BeatBoxServer{
	
	public static void main (String[] arg) {
		try {
			ServerSocket serverSock = new ServerSocket(5555);
			while(true) {
				Socket socket = serverSock.accept();
				BeatBoxServer beatBoxServer = new BeatBoxServer();
				Runnable bbServerClient = beatBoxServer.new BeatBoxServerClient();
				Thread sockThread = new Thread();
				sockThread.start();
			}
		}catch(IOException e) {
			System.out.println("ServerSocket problem!");
		}
	}
	
	 class BeatBoxServerClient implements Runnable {

		@Override
		public void run() {
			
			String message;		
		}

	}
}
