import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

enum PizzaSize {
	SMALL,
	MEDIUM,
	LARGE
}
class AppController {
	public void run() 
	{
		this.generateAppTitle();
	}

	private void generateAppTitle() 
	{	
		BufferedImage image = this.generateImage("PIZZA SHOP");
		for (int i =0; i < image.getHeight() ; i++) 
		{
			StringBuilder sb = new StringBuilder();
			for(int j =0 ; j < image.getWidth() ; j ++) 
			{
				sb.append(image.getRGB(j, i) != Color.WHITE.getRGB() ? " " : "&");
			}
			if(sb.toString().trim().isEmpty()) {
				continue;
			}
			System.out.println("\u001B[41m" + sb);
		}
	}
	
	private BufferedImage generateImage(String text) 
	{
		BufferedImage image = new BufferedImage(150, 30, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		g.setFont(new Font("Consolas",Font.BOLD,20));
		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		graphics.drawString(text, 10, 20);
		return image;
	}
}

public class App 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AppController app = new AppController();
		app.run();
	}

}
