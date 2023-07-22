package ChatApplication;

import java.net.*;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;

public class Client extends JFrame{
	
	Socket socket;
	BufferedReader br;
	PrintWriter out;
	private JLabel heading = new JLabel("Client Area");
	private JTextArea messageArea = new JTextArea();
	private JTextField messageInput = new JTextField();
	private Font font = new Font("Roboto",Font.PLAIN,20);
	private ImageIcon ic = new ImageIcon("enemy.png");
	
	
	//Constructor
	public Client(){
		try {
		    System.out.println("Sending request to server");
			socket = new Socket("127.0.0.1",7777);
			System.out.println("connecting done..");
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out=new PrintWriter(socket.getOutputStream());
			createGui();
			HandleEvents();
			startReading();
			//startWriting();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void createGui() {
		
		this.setTitle("Cient Messager");
		this.setSize(600,700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Coding for components
		heading.setFont(font);
		messageArea.setFont(font);
		messageArea.setFont(font);
	
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		heading.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		heading.setIcon(ic);
		
		messageInput.setHorizontalAlignment(SwingConstants.CENTER);
		
		this.setLayout(new BorderLayout());
		
		this.add(heading,BorderLayout.NORTH);
		this.add(messageArea,BorderLayout.CENTER);
		this.add(messageInput,BorderLayout.SOUTH);
		
		
		
		this.setVisible(true);
		
	}
	
	
	public void HandleEvents() {
		
		messageInput.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				
				if(e.getKeyCode()==10) {
					System.out.println("you pressed enter button");
					String contentToSend = messageInput.getText();
					messageArea.append("Me : "+contentToSend+"\n");
					out.println(contentToSend);
					out.flush();
					messageInput.setText(" ");
					messageArea.setFocusable(false);
					
				}
			}
			
		});
	}
	
	
	//Method to read
	public void startReading() 
	{
		//This read the data and returns it
		Runnable r1 =()->
		{
			System.out.println("reader started..");
			while(true) 
			{
				try 
				{
					String msg = br.readLine();
					if(msg.equals("exit"))
					{
						System.out.println("Server terminated chat");
						JOptionPane.showMessageDialog(null, "Server Terminated the chat");
						messageInput.setEnabled(false);
						socket.close();
						break;
					}
					
					messageArea.append("Server : "+msg+"\n");
					
				} 
				catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		};
		
		new Thread(r1).start();
	}
	//Method to write
	public void startWriting() 
	{
        Runnable r2 =()->
        {
        	System.out.println("Writer started..");
			while(true) 
			{
				try 
				{
					BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
					String content = br1.readLine();
					out.println(content);
					out.flush();
					
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		};
		new Thread(r2).start();
	}
	
	public static void main(String[] args) {
		System.out.println("This is client...");
		new Client();
	}

}
