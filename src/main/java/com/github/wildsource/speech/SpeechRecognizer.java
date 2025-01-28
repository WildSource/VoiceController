package com.github.wildsource.speech;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;
import java.io.IOException;

public class SpeechRecognizer {
    private LiveSpeechRecognizer recognizer;
    private Configuration configuration;

    public SpeechRecognizer() {
        setupConfig();
        try {
            this.recognizer = new LiveSpeechRecognizer(this.configuration);
        } catch (IOException e) {
            System.out.println("LiveSpeechRecognizer initialization failed");
        }
    }

    public void findMicrophone() {
        for (
                Mixer.Info info : AudioSystem.getMixerInfo()) {
            System.out.println(info.getName() + " - " + info.getDescription());
        }
    }

    private void setupConfig() {
        this.configuration = new Configuration();
        this.configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        this.configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
        this.configuration.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");
    }

    public LiveSpeechRecognizer getRecognizer() {
        return recognizer;
    }

    public void setRecognizer(LiveSpeechRecognizer recognizer) {
        this.recognizer = recognizer;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }
}
