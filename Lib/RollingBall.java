package Lib;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RollingBall extends JPanel implements ActionListener{

    int x = 100;
    int start_Angle = 0;
    public RollingBall(){
        Timer T = new Timer(30, this);
        T.start();
    }

    public void paintComponent (Graphics g){
        super.paintComponent(g);
        g.drawOval(x, 90, 80, 80);
        g.fillArc(x, 90, 80, 80, start_Angle, 180);
    }

    public void actionPerformed(ActionEvent e){
        x = x -2;
        start_Angle = start_Angle +5;
        if (x < -80) {
            x = getWidth();
        }
        if (start_Angle < -360) {
            start_Angle = getWidth();
        }
        repaint();
    }

}
