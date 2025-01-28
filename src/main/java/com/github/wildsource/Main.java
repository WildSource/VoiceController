package com.github.wildsource;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.result.WordResult;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		for (Mixer.Info info : AudioSystem.getMixerInfo()) {
			System.out.println(info.getName() + " - " + info.getDescription());
		}

		Configuration configuration = new Configuration();

		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");

		LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(configuration);
		// Start recognition process pruning previously cached data.
		recognizer.startRecognition(true);
		
		while (true) {
			SpeechResult result = recognizer.getResult();
			System.out.println(result.getHypothesis());
		}

		// Pause recognition process. It can be resumed then with
		// startRecognition(false).
		// recognizer.stopRecognition();
	}
}