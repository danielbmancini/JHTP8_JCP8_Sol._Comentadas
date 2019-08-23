package ex14_14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class GuessingGamePanel extends JPanel {
    private int number;
    private Random random;
    private JTextArea description;
    private JLabel tooHigh;
    private JLabel tooLow;
    private JTextField textField;
    private JButton startGame;

    GuessingGamePanel() {
        setLayout(new GridLayout(2, 2));
        textField = new JTextField();
        random = new Random();
        description = new JTextArea("I have a number between 1 and \n1000. Can you guess my number?\n" +
                "Please enter your first guess.");
        tooHigh = new JLabel("Too high");
        tooLow = new JLabel("Too low");
        startGame = new JButton("Start");
        startGame.addActionListener(new ButtonHandler());
        add(startGame);
    }

    private void randomizeNumber() {
        number = random.nextInt(1000) + 1;
    }

    private int getNumber() {
        return number;
    }

    private void newGame() {
        remove(startGame);
        setBackground(Color.WHITE);
        JButton resetButton = new JButton("reset");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                removeAll();
                textField.setEditable(true);
                newGame();
            }
        });
        add(resetButton);
        randomizeNumber();
        description.setEditable(false);
        add(description);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int guess = 0;
                try {
                    guess = Integer.parseInt(textField.getText());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    textField.setText(""); //clears guess in textField
                    nextInsert(guess);
                    changeBackground(guess);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        });
        add(textField);
        updateUI();
    }

    private void nextInsert(int guess) throws Exception {
        if (guess == 0)
            throw new Exception("Guessing Error");
        if (guess == getNumber()) {
            textField.setEditable(false);
            JOptionPane.showMessageDialog(getRootPane(), "Correct!");
        } else if (guess < getNumber()) {
            remove(tooHigh);
            add(tooLow);
            updateUI();
        } else {
            remove(tooLow);
            add(tooHigh);
            updateUI();
        }


    }

    private void changeBackground(int guess) {
        if (Math.abs(guess - getNumber()) > 100) //100 is an arbitrary proximity definition
            setBackground(Color.blue);
        else
            setBackground(Color.red);
    }

    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            newGame();
        }
    }
}