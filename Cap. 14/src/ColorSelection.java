import ex14_08.ColorSelectionPanel;

import javax.swing.JFrame;

/*
    Exercise 14.8 main class
 */
public class ColorSelection {
    public static void main(String[] args) {
        ColorSelectionPanel colorSelectionPanel = new ColorSelectionPanel();
        JFrame jFrame = new JFrame("ColorSelect");
        jFrame.setSize(225, 100);
        jFrame.add(colorSelectionPanel);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
