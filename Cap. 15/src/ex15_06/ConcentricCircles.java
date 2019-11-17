package ex15_06;

import javax.swing.JFrame;

public class ConcentricCircles {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        ConcentricCirclesJPanel concentricCirclesJPanel = new ConcentricCirclesJPanel();

        jFrame.add(concentricCirclesJPanel);
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
