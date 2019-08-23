package ex14_14;

import javax.swing.JFrame;

public class GuessingGame {
    public static void main(String[] args) {
        JFrame guessingGameFrame = new JFrame("Guessing Game");
        guessingGameFrame.add(new GuessingGamePanel());
        guessingGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guessingGameFrame.setSize(500, 500);
        guessingGameFrame.setVisible(true);
    }
}