package ex15_09;

import javax.swing.JPanel;
import java.awt.geom.GeneralPath;
import java.util.Random;
import java.awt.*;

public class RandomTrianglesJPanel extends JPanel {
    private static Random random = new Random();

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        for (int i = 0; i < random.nextInt(15); i++) {
            graphics2D.setPaint(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            graphics2D.fill(triangle());
        }
    }

    private GeneralPath triangle() {
        GeneralPath path = new GeneralPath();
        path.moveTo(random.nextInt(500), random.nextInt(500));
        for (int i = 0; i < 3; i++)
            path.lineTo(random.nextInt(500), random.nextInt(500));
        return path;
    }
}
