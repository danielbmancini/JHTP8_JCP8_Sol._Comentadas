package ex9_01;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class DrawPanel extends JPanel {
    private static Random random = new Random();
    private MyOval[] ovals = new MyOval[random.nextInt(9) + 1];
    private MyRectangle[] rectangles = new MyRectangle[random.nextInt(5) + 5];
    DrawPanel(boolean fill) {
        setBackground(Color.white);
        for (int i = 0; i < ovals.length; i++) {
            int[] coordinates = new int[4];
            for (int j = 0; j < coordinates.length; j++) {
                coordinates[j] = random.nextInt(175) + 1; //bound = JFrame size / 2
            } //end of internal for (j)
                Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                ovals[i] = new MyOval(coordinates[0], coordinates[1], coordinates[2], coordinates[3], color, fill);
        }//end of external for   (i)

        for (int i = 0; i < rectangles.length; i++) { //same function as the other for (i)
            int[] coordinates = new int[4];
            for (int j = 0; j < coordinates.length; j++) {
                coordinates[j] = random.nextInt(175) + 1;
            }//end of internal for (j)
                Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                rectangles[i] = new MyRectangle(coordinates[0], coordinates[1], coordinates[2], coordinates[3], color, fill);

        } //end of external for (i)
    }//end of constructor}

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (MyRectangle myRectangle : rectangles)
            myRectangle.draw(g);

        for (MyOval myOval : ovals)
            myOval.draw(g);

    }

    String getShapeCountString() {
        return String.format("Ovals: %d, Rectangles: %d", ovals.length, rectangles.length);
    }

}