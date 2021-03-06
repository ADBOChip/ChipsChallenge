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
 * Kelas untuk memainkan musik saat game sudah dimenangkan
 * menggunakan Thread untuk memaikan musik 
 */
public class AudioWin {

    private String filename;
    private Player player;

    /**
     * Method menjalankan musik saat player sudah mencapai portal
     */
    public void play() {
        try {
            FileInputStream fis = new FileInputStream("src/Maranatha! Singers - Victory Song   Call To War.mp3");
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
     * Method menutup pemutaran suara saat di restart kembali
     */
    public void close() {
        player.close();
    }
}
