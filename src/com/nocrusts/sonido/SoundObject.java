package com.nocrusts.sonido;

import java.io.*;
import javax.sound.sampled.*;

public class SoundObject {
    private File fileLoc;
    private Clip audioClip;

    public SoundObject(final String fileLocStr) {
        try {
            fileLoc = new File(fileLocStr);
            AudioInputStream audioFile = AudioSystem.getAudioInputStream(fileLoc);
            //TODO: Finish audio implementation
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported File.");
        } catch (IOException e) {
            System.out.println("General IO error.");
        }


    }
}
