package ex15_26;

import javax.swing.JFrame;

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
