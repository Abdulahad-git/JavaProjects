package DemoChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class get {
	Socket sock;
	BufferedReader br;
	public get(){
		try {
			sock = new Socket("localhost",11111);
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			String in = br.readLine();
			System.out.println(in);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		

	}

}
