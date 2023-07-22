import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MouseUse extends JFrame implements MouseListener{
	JLabel label;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JTextArea jt;
	JButton bt;
	ImageIcon ic;
	JButton bt1;
      MouseUse()
      {this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
    	this.setSize(500, 600);
    	this.setLayout(null);
    	label = new JLabel();
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.setBounds(0, 0, 500,100);
        label.setText("Mouse OUT");
        label.setFont(new java.awt.Font("Segoe UI",1,50));
        label.addMouseListener(this);
        label1 = new JLabel();
        label1.setBackground(Color.yellow);
        label1.setOpaque(true);
        label1.setBounds(0, 100, 500,100);
        label1.setText("YELLOW");
        label1.setFont(new java.awt.Font("Segoe UI",1,50));
        label1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				label1.setBackground(Color.white);
				label1.setText("WHITE");
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				label1.setBackground(Color.yellow);
				label1.setText("YELLOW");
				
			}});
        label3 = new JLabel();
        label3.setBackground(Color.blue);
        label3.setOpaque(true);
        label3.setBounds(0, 300, 500,100);
        label3.setText("BLUE");
        label3.setFont(new java.awt.Font("Segoe UI",1,50));
        label3.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				label3.setBackground(Color.pink);
				label3.setText("PINK");
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				label3.setBackground(Color.blue);
				label3.setText("BLUE");
				
			}});
        label2 = new JLabel();
        label2.setBackground(Color.green);
        label2.setOpaque(true);
        label2.setBounds(0, 200, 500,100);
        label2.setText("GREY");
        label2.setFont(new java.awt.Font("Segoe UI",1,50));
        label2.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				label2.setBackground(Color.pink);
				label2.setText("PINK");
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				label2.setBackground(Color.green);
				label2.setText("GREEN");
				
			}});
        jt=new JTextArea();
        jt.setText("Enter Some Text");
        jt.setBounds(0, 400, 500, 50);
        this.add(jt);
        bt=new JButton("Click");
        bt.setBounds(180, 500, 100, 20);
        bt.setBackground(Color.cyan);
        bt.setFocusable(false);
        this.setResizable(false);
        this.setUndecorated(true);
        this.setLocation(500, 150);
        bt.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(jt.getText().isEmpty()) {JOptionPane.showMessageDialog(null,"Enter some text on text area");}
				else {
					if(jt.getText().toString()=="normal") {}
					else {
				String Text=jt.getText().toString();
				JOptionPane.showMessageDialog(null,Text+" is the entered in the text area..");}
				String tt=jt.getText().toString();
				switch(tt){
					case "pink":
						label.setBackground(Color.pink);
						label1.setBackground(Color.pink);
						label2.setBackground(Color.pink);
						label3.setBackground(Color.pink);
						break;
					case "normal":
						JOptionPane.showMessageDialog(null,"Hover all the panel components with mouse");
						
				}
				}
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				bt.setBackground(Color.PINK);
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				bt.setBackground(Color.cyan);
				
			}});
        this.add(bt);
        bt1=new JButton();
        bt1.setText("EXIT");
        bt1.setFocusable(false);
        bt1.setBounds(365, 500, 80, 20);
        bt1.setBackground(Color.LIGHT_GRAY);
        bt1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				bt1.setBounds(365,500,80, 50);
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				bt1.setBounds(365,500,80, 20);
				
			}});
        
        label.setAlignmentX(Font.CENTER_BASELINE);
        ic=new ImageIcon("cofee.png");
    	this.add(label);
    	this.setIconImage(ic.getImage());
    	this.add(label1);
    	this.add(label2);
    	this.add(label3);
    	this.add(bt1);
    	this.setVisible(true);
    	  
      
      }
	@Override
	public void mouseClicked(MouseEvent e) {
		
		System.out.println("Clicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		label.setBackground(Color.orange);
		label.setText("Mouse IN");
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		label.setBackground(Color.red);
		label.setText("Mouse OUT");
		
		
	}
}
