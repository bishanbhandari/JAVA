import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.*;

class Main{
    public static void main(String[] args) {
        JFrame frame =new JFrame("Space Ship Game");
        SpaceShip sp= new SpaceShip();
        sp.setPreferredSize(new Dimension(600,400));
        JButton left = new JButton("Left");
        JButton right =new JButton("Right");

        left.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("left");
                sp.moveLeft();
            }
        });
        right.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("right");
                sp.moveRight();
            }
        });
        JPanel actionPanel=new JPanel();
        actionPanel.add(left);
        actionPanel.add(right);
        frame.add(sp,BorderLayout.NORTH);
        frame.add(actionPanel,BorderLayout.SOUTH);
        frame.setSize(600,600);
        frame.setVisible(true);
    }
}