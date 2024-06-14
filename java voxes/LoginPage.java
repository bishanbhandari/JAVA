import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;

class LoginPage{
    public static void main(String[] args) {
        JFrame frame=new JFrame("Login Page");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,50,20));
        JButton button1=new JButton("Button 1");
        frame.add(button1);
        JButton button2=new JButton("Button 2");
        frame.add(button2);
        JButton button3=new JButton("Button 3");
        frame.add(button3);
        JButton button4=new JButton("Button 4");
        frame.add(button4);
        JButton button5=new JButton("Button 5");
        frame.add(button5);
        frame.setVisible(true);
    }
}