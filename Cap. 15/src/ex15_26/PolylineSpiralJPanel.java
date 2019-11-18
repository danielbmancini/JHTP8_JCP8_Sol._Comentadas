package ex15_26;

import javax.swing.JPanel;
import java.awt.*;

public class PolylineSpiralJPanel extends JPanel {
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        int[] xPoints = new int[30];
        int[] yPoints = new int[xPoints.length];
        xPoints[0] = 500;
        xPoints[1] = 571;
        yPoints[0] = 500;
        yPoints[1] = 571;
        int length = 50;
        for (int i = 0; i < yPoints.length - 1; i++) {
            length = length + 10;
            double angle = (Math.PI / 3) * (i + 1); //the shift in the spiral. Here, i chose 60° (π/3 rad) per line. Select lower values to create a rounder spiral.
            xPoints[i + 1] = (int) Math.floor(Math.cos(angle) * length + xPoints[i]);
            yPoints[i + 1] = (int) Math.floor(Math.sin(angle) * length + yPoints[i]);
        }
        graphics.drawPolyline(xPoints, yPoints, xPoints.length);
    }
}
