package com.github.wildsource.gui;

import net.miginfocom.swing.MigLayout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

public class SafetyPanel {
    private Logger logger = LoggerFactory.getLogger(SafetyPanel.class);
    private JPanel jPanel;
    private JLabel explanationLabel;
    private JLabel mouseLabel, keyboardLabel;
    private JButton disableButton;
    private JCheckBox mouseCheckBox;
    private JCheckBox keyboardCheckBox;

    public SafetyPanel() {
        this.jPanel = new JPanel();
        this.jPanel.setLayout(new MigLayout());
        createComponents();
        loadComponents();
        logger.info("Safety Panel created");
    }

    private void createComponents() {
        this.explanationLabel = new JLabel("Which input device do you want to use as fallback safety ?");
        this.mouseLabel = new JLabel("Mouse");
        this.keyboardLabel = new JLabel("Keboard");
        this.disableButton = new JButton("Disable");
        this.mouseCheckBox = new JCheckBox();
        this.keyboardCheckBox = new JCheckBox();
    }

    private void loadComponents() {
        this.jPanel.add(this.explanationLabel, "wrap");
        this.jPanel.add(this.mouseLabel);
        this.jPanel.add(this.keyboardLabel, "wrap");
        this.jPanel.add(this.mouseCheckBox);
        this.jPanel.add(this.keyboardCheckBox, "wrap");
        this.jPanel.add(this.disableButton);
    }

    public JPanel getjPanel() {
        return jPanel;
    }
}
