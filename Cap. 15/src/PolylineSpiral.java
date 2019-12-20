import ex15_26.PolylineSpiralJPanel;

import javax.swing.JFrame;

/*
    Exercise 15.26 main class
 */
public class PolylineSpiral {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        PolylineSpiralJPanel polylineSpiralJPanel = new PolylineSpiralJPanel();

        jFrame.add(polylineSpiralJPanel);
        jFrame.setSize(1000, 1000);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
