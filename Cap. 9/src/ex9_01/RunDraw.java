package ex9_01;

import javax.swing.*;
import java.awt.*;

public class RunDraw {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel(false); //test for true
        JFrame app = new JFrame();
        JLabel shapeCount = new JLabel(panel.getShapeCountString());

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.add(shapeCount, BorderLayout.SOUTH);
        app.setSize(350, 350);
        app.setVisible(true);
    }
}