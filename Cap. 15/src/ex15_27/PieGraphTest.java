package ex15_27;

import javax.swing.JFrame;

public class PieGraphTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.add(new PieGraph());
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
