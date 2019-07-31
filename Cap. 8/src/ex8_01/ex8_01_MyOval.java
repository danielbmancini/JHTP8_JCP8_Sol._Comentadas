package ex8_01;

import java.awt.*;

class ex8_01_MyOval {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color myColor;
    private final boolean fill;

    ex8_01_MyOval()
    {
        x = 0;
        y = 0;
        width = 0;
        height = 0;
        myColor = Color.black;
        fill = false;
    }

    ex8_01_MyOval(int x, int y, int width, int height, Color color, boolean fill)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        myColor = color;
        this.fill = fill;
    }

    void draw(Graphics g)
    {
        g.setColor(myColor);
        if(fill)
            g.fillOval(x,y,width,height);
        else
            g.drawOval(x,y,width,height);
    }
}