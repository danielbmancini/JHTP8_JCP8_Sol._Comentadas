package ex15_10;

import javax.swing.JFrame;

public class RandomCharacters {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        RandomCharactersJPanel randomCharactersJPanel = new RandomCharactersJPanel();

        jFrame.add(randomCharactersJPanel);
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
