package com.github.wildsource.gui;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class Gui {
    JFrame jFrame;

    public Gui() {
        SwingUtilities.invokeLater(() -> {
            this.jFrame = new JFrame("VoiceController");
            this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.jFrame.setLocationRelativeTo(null);
            this.jFrame.setMinimumSize(new Dimension(600,500));
            this.jFrame.setLayout(new MigLayout());
            this.jFrame.setVisible(true);
        });
    }
}
