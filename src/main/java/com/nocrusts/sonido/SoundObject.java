package com.nocrusts.sonido;

import java.io.*;
import javax.sound.sampled.*;

public class SoundObject {
    private Clip audioClip;
    private AudioInputStream audioIn;

    public SoundObject(String fileLoc) {
        setSoundFile(fileLoc);
    }

    public void playSound() {
        audioClip.start();
    }

    public void stopSound() {
        audioClip.stop();
    }

    public void selectTime(int SecondsIn) {
        //TODO: be implemented
    }

    public void setSoundFile (String fileLoc) {
        File file = new File("/" + fileLoc);
        try {
            audioIn = AudioSystem.getAudioInputStream(file);
        } catch (IOException e) {
            System.out.println("File not found!");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Sorry, unsupported audio format!");
        }

        try {
            audioClip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            System.out.println("Another program is already using the line.");
        }

        try {
            audioClip.open(audioIn);
        } catch (LineUnavailableException e) {
            System.out.println("Another program is already using the line.");
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }


}
