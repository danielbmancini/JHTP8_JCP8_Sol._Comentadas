package ex14_15;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.*;

public class GUIEventsFrame extends JFrame {

    private JTextArea eventsTextArea;
    private JButton button1;
    private JTextField jTextField;
    private JCheckBox checkBox1;
    private JPanel panel;
    private JList jList;

    GUIEventsFrame() {
        super("Events' toString()");
        eventsTextArea.append("\n");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                eventsTextArea.append(actionEvent.toString() + "\n\n");
            }
        });
        checkBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                eventsTextArea.append(itemEvent.toString() + "\n\n");
            }
        });
        jList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                eventsTextArea.append(listSelectionEvent.toString() + "\n\n");
            }
        });
        jTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                eventsTextArea.append(e.toString() + "\n\n");
            }
        });
        jTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                eventsTextArea.append(e.toString() + "\n\n");
            }
        });

        add(panel);
    }

}