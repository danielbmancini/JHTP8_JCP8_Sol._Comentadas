package ex15_06;

import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;

public class ConcentricCirclesJPanel extends JPanel {
    public void paintComponent(Graphics graphics) {
        Random random = new Random();

        int[][] arcs = new int[8][4];
        int a = 250 - (int) Math.floor(25 * Math.sqrt(2)); //so the centre of the circle is the centre of the 500x500 JFrame: 250 - k, for k = sqrt(2) * radius
        arcs[0] = new int[]{a, a, 50, 50};
        for (int i = 1; i < arcs.length; i++)
            for (int j = 0; j <= 1; j++)
                arcs[i][j] = arcs[i - 1][j] - 10;

        for (int i = 1; i < arcs.length; i++)
            for (int j = 2; j < arcs[0].length; j++)
                arcs[i][j] = arcs[i - 1][j] + 20;

        for (int i = 0; i < arcs.length; i++) {
            graphics.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            graphics.drawArc(arcs[i][0], arcs[i][1], arcs[i][2], arcs[i][3], 0, 360);
        }
    }
}
