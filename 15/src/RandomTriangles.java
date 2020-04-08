import ex15_09.RandomTrianglesJPanel;

import javax.swing.JFrame;

/*
    Exercise 15.9 main class
 */
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
