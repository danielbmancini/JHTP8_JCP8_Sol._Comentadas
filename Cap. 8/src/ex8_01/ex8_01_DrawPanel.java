package ex8_01;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class ex8_01_DrawPanel extends JPanel {
    private ex8_01_MyOval[] ovals;
    private ex8_01_MyRectangle[] rectangles;

    ex8_01_DrawPanel(boolean fill) {
        setBackground(Color.white);
        Random random = new Random();
        ovals = new ex8_01_MyOval[random.nextInt(5) + 5];
        rectangles = new ex8_01_MyRectangle[random.nextInt(5) + 5];
        for (int i = 0; i < ovals.length; i++) {
            boolean arbitraryUsageBoolean = true; //the arbitrary usage is that, if any of the size coordinates is 0, then the blank-parameters constructor in ex8_01_My(...) will be called.
            int[] coordinates = new int[4];
            for (int j = 0; j < coordinates.length; j++) {
                coordinates[j] = random.nextInt(300);
                if (coordinates[j] == 0 && j > 1)
                    arbitraryUsageBoolean = false;
            } //end of internal for (j)
            adjustValues(coordinates);
            if (!arbitraryUsageBoolean)
                ovals[i] = new ex8_01_MyOval();
            else {
                Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                ovals[i] = new ex8_01_MyOval(coordinates[0], coordinates[1], coordinates[2], coordinates[3], color, fill);
            }
        }//end of external for   (i)

        for (int i = 0; i < rectangles.length; i++) { //same function as the other for (i)
            boolean arbitraryUsageBoolean = true;
            int[] coordinates = new int[4];
            for (int j = 0; j < coordinates.length; j++) {
                coordinates[j] = random.nextInt(300);
                if (coordinates[j] == 0 && j > 1)
                    arbitraryUsageBoolean = false;
            }//end of internal for (j)
            adjustValues(coordinates);
            if (!arbitraryUsageBoolean)
                rectangles[i] = new ex8_01_MyRectangle();
            else {
                Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                rectangles[i] = new ex8_01_MyRectangle(coordinates[0], coordinates[1], coordinates[2], coordinates[3], color, fill);
            }

        } //end of external for (i)
    }//end of constructor}
    private static void adjustValues(int[] coordinates) //adjust the coordinates values array to fit in the 300x300 frame - messes up a little of the object distribution
    {
        for (int i = 2; i < 4 ; i++)
            if(coordinates[i] + coordinates[i-2] > 250)
                coordinates[i] -= coordinates[i-2];
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (ex8_01_MyRectangle myRectangle : rectangles)
            myRectangle.draw(g);
        for (ex8_01_MyOval myOval : ovals)
            myOval.draw(g);
    }

}