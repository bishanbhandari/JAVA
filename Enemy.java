import java.awt.*;
import java.io.File;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.*;
public class Enemy extends JPanel {
    Random randomnumber=new Random();
    int x=randomnumber.nextInt(500);
    int y=0;
    Image image;
Enemy(){
    try {
        image=ImageIO.read(new File("./image.png"));
    } catch( Exception e) {
        System.out.println("handle");
    }
}
     public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.white);
        g.drawImage(image,x, y, 100, 100,this);
    }
    public void update(){
        y+=1;
    }
}
