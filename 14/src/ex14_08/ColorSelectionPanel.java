package ex14_08;

import javax.swing.*;
import java.awt.*;

public class ColorSelectionPanel extends JPanel {
    public ColorSelectionPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        JComboBox<String> colors = new JComboBox<>(new String[]{"RED", "BLUE", "YELLOW"});
        JCheckBox background = new JCheckBox("Background");
        JCheckBox foreground = new JCheckBox("Foreground");
        JButton buttonOk = new JButton("Ok");
        JButton buttonCancel = new JButton("Cancel");

        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        add(colors, gridBagConstraints);
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        add(background, gridBagConstraints);
        gridBagConstraints.gridx = 2;
        add(foreground, gridBagConstraints);
        gridBagConstraints.gridy = GridBagConstraints.SOUTH;
        add(buttonCancel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        add(buttonOk, gridBagConstraints);
    }

}
