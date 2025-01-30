package com.github.wildsource.gui;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class DictionnaryPickerPanel {
    private JPanel jPanel;
    private JLabel instructions;
    private JButton browseButton;

    public DictionnaryPickerPanel() {
        this.jPanel = new JPanel();
        this.jPanel.setLayout(new MigLayout());
        this.jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.instructions = new JLabel("Select a csv file that contains words that needs to be detected:");
        this.jPanel.add(this.instructions, "wrap");
        this.browseButton = new JButton("Browse");
        this.jPanel.add(this.browseButton);
    }

    public JPanel getjPanel() {
        return jPanel;
    }
}
