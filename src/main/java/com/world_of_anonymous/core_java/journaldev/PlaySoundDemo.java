package com.world_of_anonymous.core_java.journaldev;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.IOException;
import java.net.URL;

public class PlaySoundDemo extends JFrame {

  public PlaySoundDemo() {
    this.setTitle("Play sound Demo");
    this.setSize(300, 200);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    try {
      URL url = this.getClass().getResource("./audio/sound_test.mp3");
      AudioInputStream audio = AudioSystem.getAudioInputStream(url);
      Clip clip = AudioSystem.getClip();
      clip.open(audio);
      clip.start();
    } catch (UnsupportedAudioFileException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (LineUnavailableException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    new PlaySoundDemo();
  }
}
