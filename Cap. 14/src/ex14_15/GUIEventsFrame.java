package ex14_15;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

public class GUIEventsFrame extends JFrame {
    private JTextArea eventsTextArea;
    private JButton button1;
    private JTextField jTextField;
    private JCheckBox checkBox1;
    private JPanel panel;
    private JList<String> jList;
    private JScrollPane jScrollPane;

    public GUIEventsFrame() {
        super("Events' toString()");

        init();
        add(panel);
    }

    private void init() {
        eventsTextArea = new JTextArea();

        eventsTextArea.setText("Events:");
        eventsTextArea.setToolTipText("Shows events' toString().");
        eventsTextArea.setLineWrap(true);

        jScrollPane = new JScrollPane(eventsTextArea);
        button1 = new JButton("Button");
        checkBox1 = new JCheckBox("CheckBox");
        jList = new JList<>(new String[]{"Change", "Selection"});
        jTextField = new JTextField("JTextField");
        panel = new JPanel(new GridBagLayout());

        addComponents();
    }

    private void addComponents() {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 13;
        constraints.gridheight = 20;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        panel.add(jScrollPane, constraints);
        constraints.insets = new Insets(50, 0, 50, 0);
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridx = 13;
        constraints.gridy = 1;
        constraints.gridwidth = 7;
        constraints.gridheight = 3;
        constraints.weighty = 0;
        panel.add(button1, constraints);
        constraints.gridy = 6;
        constraints.gridwidth = 6;
        constraints.gridheight = 2;
        panel.add(checkBox1, constraints);
        constraints.gridy = 10;
        constraints.weightx = 1;
        constraints.weighty = 1;
        panel.add(jList, constraints);
        constraints.gridy = 13;
        constraints.gridheight = 3;
        constraints.weighty = 0;
        panel.add(jTextField, constraints);
        addListeners();
    }

    private void addListeners() {
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
    }
}
