package ex15_15;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class TetrahedronJPanel extends JPanel { //and be there perspective!
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.draw(tetrahedron());
    }

    private GeneralPath tetrahedron() {
        Random random = new Random();
        GeneralPath path = new GeneralPath();
        int[][] tetrapoints = new int[4][2];
        for (int i = 0; i < tetrapoints.length; i++)
            for (int j = 0; j < tetrapoints[0].length; j++)
                tetrapoints[i][j] = random.nextInt(500);
        path.moveTo(tetrapoints[0][0], tetrapoints[0][1]);
        path.lineTo(tetrapoints[1][0], tetrapoints[1][1]);
        path.lineTo(tetrapoints[2][0], tetrapoints[2][1]);
        path.lineTo(tetrapoints[0][0], tetrapoints[0][1]);
        path.lineTo(tetrapoints[3][0], tetrapoints[3][1]);
        path.lineTo(tetrapoints[1][0], tetrapoints[1][1]);
        path.moveTo(tetrapoints[3][0], tetrapoints[3][1]);
        path.lineTo(tetrapoints[2][0], tetrapoints[2][1]);

        return path;
    }
}
