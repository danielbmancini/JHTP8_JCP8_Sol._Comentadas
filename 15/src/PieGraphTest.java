import ex15_27.PieGraph;

import javax.swing.JFrame;

/*
    Exercise 15.27 main class
 */
public class PieGraphTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.add(new PieGraph());
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
