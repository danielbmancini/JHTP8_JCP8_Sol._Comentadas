import ex15_15.TetrahedronJPanel;

import javax.swing.JFrame;

/*
    Exercise 15.15 main class
 */
public class Tetrahedron {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        TetrahedronJPanel tetrahedronJPanel = new TetrahedronJPanel();

        jFrame.add(tetrahedronJPanel);
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
