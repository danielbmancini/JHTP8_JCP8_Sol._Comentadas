package ex8_01;

import javax.swing.JFrame;
public class ex8_01_RunDraw {
    public static void main(String[] args) {
        ex8_01_DrawPanel panel = new ex8_01_DrawPanel(false); //test for true
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300,300);
        app.setVisible(true);
    }
}