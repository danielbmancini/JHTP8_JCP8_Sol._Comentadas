import ex14_14.GuessingGamePanel;

import javax.swing.JFrame;

/*
    Exercise 14.14 main class
 */
public class GuessingGame {
    public static void main(String[] args) {
        JFrame guessingGameFrame = new JFrame("Guessing Game");
        guessingGameFrame.add(new GuessingGamePanel());
        guessingGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guessingGameFrame.setSize(500, 500);
        guessingGameFrame.setVisible(true);
    }
}