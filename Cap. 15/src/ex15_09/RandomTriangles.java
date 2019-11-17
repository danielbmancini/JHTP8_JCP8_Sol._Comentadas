package ex15_09;

import javax.swing.JFrame;

public class RandomTriangles {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        RandomTrianglesJPanel randomTrianglesJPanel = new RandomTrianglesJPanel();

        jFrame.add(randomTrianglesJPanel);
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
