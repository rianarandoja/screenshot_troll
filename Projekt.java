package projekt;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Projekt {
        public static void main(String[] args) throws Exception {
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, "png", new File("C:\\Users\\Kasutaja\\OneDrive\\TARTU ÜLIKOOL\\OOP\\IntelliJ projects\\src\\projekt\\screenshot.png")); //TEEB SCREENSHOTI
        new Aken(); //Loob akna ja lisab loodud screenshoti aknasse.
        }}
