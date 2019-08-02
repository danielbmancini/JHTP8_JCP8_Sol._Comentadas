package ex8_01;

import javax.swing.JFrame;

public class RunDraw {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel(false); //test for true
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(350, 350);
        app.setVisible(true);
    }
}