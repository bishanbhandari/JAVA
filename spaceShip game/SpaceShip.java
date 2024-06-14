import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class SpaceShip extends JPanel {
    int x=0;
    int y=100;
    private Image spaceShipImage;

    SpaceShip(){
         super();
        try{
            spaceShipImage =ImageIO.read(new File("./spiked ship 3.png"));
        }catch(IOException e){
            System.out.println(e);
        }
    }

    public void moveLeft(){
        x-=10;
        repaint();
    }
    public void moveRight(){
        x+=10;
        repaint();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        // g.fillRect(x, y, 100, 100);
        g.drawImage(spaceShipImage, x, y, 100,100,this);
    }
}
