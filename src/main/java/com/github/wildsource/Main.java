package com.github.wildsource;

import com.github.wildsource.gui.Gui;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.result.WordResult;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;
import javax.swing.*;
import java.io.IOException;

public class Main implements Runnable {
	@Override
	public void run() {
		new Gui();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Main());
	}
}