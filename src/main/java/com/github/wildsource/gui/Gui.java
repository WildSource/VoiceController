package com.github.wildsource.gui;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Gui {
    private Logger logger = LoggerFactory.getLogger(Gui.class);
    private JFrame jFrame;

    public Gui() {
        frameSetup();
        addComponents();
        this.jFrame.setVisible(true);
        logger.info("JFrame created");
    }

    private void frameSetup() {
        this.jFrame = new JFrame("VoiceController");
        this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jFrame.setLocationRelativeTo(null);
        this.jFrame.setMinimumSize(new Dimension(600, 500));
        this.jFrame.setLayout(new MigLayout());
    }

    private void addComponents() {
        this.jFrame.add(new SafetyPanel().getjPanel(), "wrap");
        this.jFrame.add(new DictionnaryPickerPanel().getjPanel());
    }
}
