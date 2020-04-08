package ex15_10;

import java.awt.*;
import java.util.Random;
import javax.swing.JPanel;

public class RandomCharactersJPanel extends JPanel {
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Random random = new Random();
        for (int i = 0; i < random.nextInt(30) + 5; i++) {
            graphics.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            graphics.setFont(new Font("", random.nextInt(3), random.nextInt(50) + 10));
            char character = (char) ((char) random.nextInt(26) + 'a');
            graphics.drawChars(new char[]{character}, 0, 1, random.nextInt(500), random.nextInt(500));
        }
    }

}
