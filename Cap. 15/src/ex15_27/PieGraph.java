package ex15_27;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Arc2D;
import java.util.Random;

public class PieGraph extends JPanel {
    private JTextField textField1;
    private JLabel insert4NumbersLabel;
    int[] angle_extent;
    final int[] i = {0};
    private Random random = new Random();

    public PieGraph() {
        int[] numbers = new int[4];
        setLayout(new GridBagLayout());
        textField1 = new JTextField();
        textField1.setHorizontalAlignment(JTextField.CENTER);
        insert4NumbersLabel = new JLabel("Insert 4 numbers:");
        GridBagConstraints constraints =
                new GridBagConstraints(5, 2, 10, 3, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.NONE, new Insets(50, 0, 50, 0), 0, 0);
        add(insert4NumbersLabel, constraints);
        constraints.gridy = 5;
        constraints.insets = new Insets(0, 0, 0, 0);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(textField1, constraints);
        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                    try {
                        numbers[i[0]] = Integer.parseInt(textField1.getText());
                        textField1.setText("");
                        System.out.println(numbers[i[0]]);
                        if (i[0] < 3)
                            i[0]++;
                        else {
                            removeAll();
                            int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3];
                            angle_extent = new int[]{(int) Math.floor(360.0 * numbers[0] / sum), (int) Math.floor(360.0 * numbers[1] / sum),
                                    (int) Math.floor(360.0 * numbers[2] / sum), (int) Math.floor(360.0 * numbers[3] / sum)};
                            repaint();
                        }
                    } catch (Exception ignored) {
                    }
            }
        });


    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;

        if (i[0] == 3) {
            changeColor(graphics2D);
            graphics2D.fill(new Arc2D.Double(150, 200, 200, 100, 0, angle_extent[0], Arc2D.PIE));
            changeColor(graphics2D);
            graphics2D.fill(new Arc2D.Double(150, 200, 200, 100, angle_extent[0], angle_extent[1], Arc2D.PIE));
            changeColor(graphics2D);
            graphics2D.fill(new Arc2D.Double(150, 200, 200, 100, angle_extent[1] + angle_extent[0], angle_extent[2], Arc2D.PIE));
            changeColor(graphics2D);
            graphics2D.fill(new Arc2D.Double(150, 200, 200, 100, angle_extent[2] + angle_extent[1] + angle_extent[0], angle_extent[3], Arc2D.PIE));
        }

    }

    private void changeColor(Graphics2D graphics2D) {
        graphics2D.setPaint(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
    }
}
