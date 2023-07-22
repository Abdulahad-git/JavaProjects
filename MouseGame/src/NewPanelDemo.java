import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class NewPanelDemo{
	
	public static void main(String[]args) {
		JLabel lab=new JLabel();
		JLabel label=new JLabel();
		JLabel label2=new JLabel();
		JLabel label1=new JLabel();
		label1.setFont(new java.awt.Font("Segoe UI",1,20));
		label1.setForeground(Color.WHITE);
		label1.setText("              Random Colors");
		label.setBackground(Color.red);
		label.setBounds(0, 0, 500,50);
		label.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setBounds(90, 15, 300,25);
		label1.setOpaque(true);
		
		label2.setBounds(25, 15, 50, 25);
		label2.setBackground(Color.yellow);
		label2.setOpaque(true);
		label2.setText("   New");
		label2.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
			
			
			//lab.setBackground(new Color((int) (Math.random()*250),(int) (Math.random()*250),(int) (Math.random()*250)));
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				lab.setBackground(new Color((int) (Math.random()*250),(int) (Math.random()*250),(int) (Math.random()*250)));
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		lab.setBounds(0, 50, 500, 500);
		lab.setBackground(Color.gray);
		lab.setOpaque(true);
		JLayeredPane layerPane=new JLayeredPane();
		layerPane.setBounds(0, 0, 500, 500);
		layerPane.add(lab);
		layerPane.add(label1);
		layerPane.add(label2);
		layerPane.add(label);
		
		
		
		JFrame frame=new JFrame("Layered Pane");
		frame.add(layerPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500,500));
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
	}

}
