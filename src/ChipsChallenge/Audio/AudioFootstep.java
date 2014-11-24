/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChipsChallenge.Audio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

/**
 * Kelas untuk menjalankan suara saat player sedang melakukan pergerakan 
 */
public class AudioFootstep {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    private  String filename;
    private  Player player;
    
    /**
     * Method untuk menjalankan suara
     */
    public  void play() {
        try {
            FileInputStream fis = new FileInputStream("src/FOLEY HUMAN STOMP DIRT 01.mp3");
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
        } catch (Exception e) {
            System.out.println("Problem playing file " + filename);
            System.out.println(e);
        }

        // run in new thread to play in background
        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                    //player.play();

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }.start();

    }
    
    /**
     * Method untuk menutup suara saat player mati
     */
    public void close() {
        player.close();
    }
}


