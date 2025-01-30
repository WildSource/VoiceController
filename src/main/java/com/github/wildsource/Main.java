package com.github.wildsource;

import com.github.wildsource.gui.Gui;

import javax.swing.*;


public class Main implements Runnable {
	@Override
	public void run() {
		new Gui();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Main());
	}
}