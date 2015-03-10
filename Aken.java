package projekt;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Aken extends JFrame implements MouseListener{
JFrame frame;
File pilt = new File("C:/Users/Getu/Desktop/screenshot.png");
BufferedImage image = ImageIO.read(pilt);
BufferedImage img;
String hiir = "";


	void randomImage() throws Exception{
		int random = (int) Math.round(Math.random()* 3);
		if(random == 1){
			this.img = ImageIO.read(new File("C:/Users/Getu/Desktop/crack.gif"));
		}
		else if(random == 2){
			this.img = ImageIO.read(new File("C:/Users/Getu/Desktop/crack2.gif"));
		}else{
			this.img = ImageIO.read(new File("C:/Users/Getu/Desktop/crack3.gif"));
		}
	}
	//void mouseClick(MouseEvent e){
	//	Graphics2D g2d = image.createGraphics();
	//	g2d.setColor(Color.RED);
	//	g2d.fillRect(0, 0, image.getWidth(), image.getHeight());
	//	g2d.dispose();
	//	Point asukoht = frame.getMousePosition();
	//	Graphics g = frame.getGraphics();
	//	g.drawLine(asukoht.x-10, asukoht.y, asukoht.x+10, asukoht.y);
	//}
	
	public void mousePressed(MouseEvent e){
	    if(e.getButton() == MouseEvent.BUTTON1){
	    	Point asukoht = frame.getMousePosition();
	    	Graphics g = frame.getGraphics();
			//g.drawLine(asukoht.x-10, asukoht.y, asukoht.x+10, asukoht.y);
	    	try {
				randomImage();
			} catch (Exception e1) {
				
			}
			g.drawImage(img, asukoht.x-30, asukoht.y-30, null);
	    }	    
	    
	    else if(e.getButton() == MouseEvent.BUTTON3){//CURSORI PILDI MUUTMINE HETKEL
	    	Toolkit toolkit = Toolkit.getDefaultToolkit();
	    	  Image image = toolkit.getImage("C:/Users/Getu/Desktop/crack.gif");
	    	  Cursor c = toolkit.createCustomCursor(image , new Point(frame.getX(), frame.getY()), "img");
	    	  frame.setCursor (c);
	    }
	    else if(e.getButton() == MouseEvent.BUTTON2) {
	    	String hiir = "Pomm";
	    	Graphics g = frame.getGraphics();
	    	Toolkit toolkit = Toolkit.getDefaultToolkit();
	    	Image image = toolkit.getImage("C:/Users/Kalvar/Desktop/pomm2.gif");
	    	Cursor c = toolkit.createCustomCursor(image , new Point(frame.getX(), frame.getY()), "img");
	    	frame.setCursor (c);
	}
}
	
		Aken() throws Exception{
        JLabel label = new JLabel(new ImageIcon(image));
		frame = new JFrame("Test");
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.createImage(frame.getWidth(), frame.getHeight());
		frame.show();
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
		frame.addMouseListener(this);
		
		
   
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
}
