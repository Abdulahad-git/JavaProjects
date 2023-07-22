package DemoChat;

import java.io.*;
import java.net.*;

public class serve {
	
	ServerSocket server;
	Socket socket;
	BufferedReader br;
	PrintWriter out;
	
	public serve() {
		try {
			server = new ServerSocket(11111);
			socket = server.accept();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new serve();
		
		System.out.println("Server Has Started");
	}

}
