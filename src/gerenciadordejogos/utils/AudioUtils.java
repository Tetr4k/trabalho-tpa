/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciadordejogos.utils;

import java.io.File;
import javax.sound.sampled.*;

/**
 *
 * @author gabriel
 */
public class AudioUtils {
    public static void beep() {
        try {
            File beepFile = new File("./src/gerenciadordejogos/assets/BeepShort.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(beepFile);
            DataLine.Info info = new DataLine.Info(Clip.class, audioInputStream.getFormat());
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioInputStream);
            //FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            //gainControl.setValue(10f);
            clip.start(); 
            //Ajustar volume
        } catch (Exception e) {
            
        }
    }
}
