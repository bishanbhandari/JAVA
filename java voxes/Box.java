import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Box extends JPanel {

    private Rectangle[] boxes=new Rectangle[1000];
    Random random=new Random();

    Box(){
        super();
        for(int i=0;i<boxes.length;i++){
            boxes[i]=new Rectangle(random.nextInt(500),random.nextInt(500),20,20);
        }
    }
    public void paintComponent(Graphics g) {
        g.setColor(Color.pink);
        for(int i=0;i<this.boxes.length;i++){
            g.fillRect(this.boxes[i].x, this.boxes[i].y, 20, 20);

        }
        // g.setColor(Color.black);
        // g.fillOval(20, 160, 100, 100);
        // g.fillOval(300, 160, 100, 100);
    }
}
