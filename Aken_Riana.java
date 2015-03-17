package projekt;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Aken extends JFrame implements MouseListener, ActionListener {

    ArrayList<String> pilt_list  = new ArrayList<String>(Arrays.asList(//kõik erinevad kursori pildid on siin listis
            "C:\\Users\\Riana\\OneDrive\\TARTU ÜLIKOOL\\OOP\\IntelliJ projects\\src\\projekt\\pomm2.gif",
            "C:\\Users\\Riana\\OneDrive\\TARTU ÜLIKOOL\\OOP\\IntelliJ projects\\src\\projekt\\Mjolnir.png",
            "C:\\Users\\Riana\\OneDrive\\TARTU ÜLIKOOL\\OOP\\IntelliJ projects\\src\\projekt\\moustache.png"
    ));

    JFrame frame;
    File pilt = new File("C:\\Users\\Riana\\OneDrive\\TARTU ÜLIKOOL\\OOP\\IntelliJ projects\\src\\projekt\\screenshot.png");
    BufferedImage image = ImageIO.read(pilt);
    BufferedImage img;

    // muutujad kursori pildi vahetuseks
    String viimatine_pilt;
    int list_pikkus = pilt_list.size();
    int i = (int)(Math.round(Math.random()*(list_pikkus-1)));  //esimesena tulev pilt on RANDOM

    int a, b; // pildi asukoha määramine

    public void mousePressed(MouseEvent event) {

        //vasak hiireklikk ehk midagi tekib ekraanile juurde
        if(event.getButton() == MouseEvent.BUTTON1){
            Point asukoht = frame.getMousePosition();
            Graphics g = frame.getGraphics();
            try {
                if (viimatine_pilt.endsWith("2.gif")) {img = ImageIO.read(new File(Pildid.pomm())); a = asukoht.x-80; b = asukoht.y-60;}
                else if  (viimatine_pilt.endsWith("r.png")) {img = ImageIO.read(new File(Pildid.crack())); a = asukoht.x-30; b = asukoht.y-30;}
                else if  (viimatine_pilt.endsWith("e.png")) {img = ImageIO.read(new File(Pildid.moustache())); a = asukoht.x-235; b = asukoht.y-240;}
            }
            catch (Exception e1) {}
            g.drawImage(img, a, b, null);}

        // parem hiireklikk, vahetab kursori pilti (võtab listist järjest)
        else if(event.getButton() == MouseEvent.BUTTON3){
            setKursor(pilt_list.get(i));
            viimatine_pilt = pilt_list.get(i);
            i++;
            if (i == list_pikkus){i = 0;}}}


    public void setKursor(String pilt) {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Image image = toolkit.getImage(pilt);
            Cursor c = toolkit.createCustomCursor(image , new Point(frame.getX(), frame.getY()), "img");
            frame.setCursor (c);}

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
        frame.addMouseListener(this);}

    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void actionPerformed(ActionEvent event) {}}
