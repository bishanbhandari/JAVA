import javax.swing.*;
public class GameLoop {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Box Render");
        Box box =new Box();
        frame.add(box);
        frame.setSize(700,700);
        frame.setVisible(true);
    }
}
