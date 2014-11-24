/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChipsChallenge.grafficStorage;

import ChipsChallenge.Control.ChipsController;
import ChipsChallenge.Engine.Board;
import ChipsChallenge.Engine.Tile;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * Merupakan Kelas View dalam MVC
 */
public class ChipImageDrawer extends JPanel {

    private Image tileBiasa;
    private Image air;
    private Image api;
    private Image chip;
    private Image pintu;
    private Image portal;
    private Image sepatuAir;
    private Image sepatuApi;
    private Image tembok;
    private Image playerBawah;
    private Image playerAtas;
    private Image playerKiri;
    private Image playerKanan;
    private Image kunci;
    private Image theEnd;
    private Image youLose;
    private Image S;
    private Image I;
    private Image A;
    private Image C;
    private Image H;
    private Image P;
    private Image a0;
    private Image a1;
    private Image a2;
    private Image a3;
    private Image a4;
    private Image a5;
    private ChipsController cc;

    /**
     * Konstruktor
     */
    public ChipImageDrawer() {

        setFocusable(true);
        this.cc = new ChipsController();
        loadImages();
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if ((cc.chipIsAlive()) && (cc.getSelesai() == false)) {
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_UP:
                            cc.moveChipUp();
                            repaint();
                            if(cc.getSelesai()==true){
                               cc.infoBox("Anda Menang", "Selamat");
                            }
                            break;
                        case KeyEvent.VK_DOWN:
                            cc.moveChipDown();
                            repaint();
                            if(cc.getSelesai()==true){
                               cc.infoBox("Anda Menang", "Selamat");
                            }
                            break;
                        case KeyEvent.VK_LEFT:
                            cc.moveChipLeft();
                            repaint();
                            if(cc.getSelesai()==true){
                               cc.infoBox("Anda Menang", "Selamat");
                            }
                            break;
                        case KeyEvent.VK_RIGHT:
                            cc.moveChipRight();
                            repaint();
                            if(cc.getSelesai()==true){
                               cc.infoBox("Anda Menang", "Selamat");
                            }
                            break;
                    }
                    

                }
                

            }
            

        }
        );
        
        
    }

    /**
     * Method untuk meload gambar(image) menggunakan javax.imageio.ImageIO
     */
    public void loadImages() {
        try {
            this.tileBiasa = ImageIO.read(new File("src\\Image\\tilebiasa.png"));
            this.air = ImageIO.read(new File("src\\Image\\air.png"));
            this.api = ImageIO.read(new File("src\\Image\\api.png"));
            this.chip = ImageIO.read(new File("src\\Image\\Chips.png"));
            this.pintu = ImageIO.read(new File("src\\Image\\wall.png"));
            this.portal = ImageIO.read(new File("src\\Image\\Portal.jpg"));
            this.sepatuAir = ImageIO.read(new File("src\\Image\\Pokeball_biru.png"));
            this.sepatuApi = ImageIO.read(new File("src\\Image\\Pokeball_merah.png"));
            this.tembok = ImageIO.read(new File("src\\Image\\tree.png"));
            this.playerBawah = ImageIO.read(new File("src\\Image\\Trainer_Bawah.png"));
            this.playerAtas = ImageIO.read(new File("src\\Image\\Trainer_Atas.png"));
            this.playerKiri = ImageIO.read(new File("src\\Image\\Trainer_Kiri.png"));
            this.playerKanan = ImageIO.read(new File("src\\Image\\Trainer_Kanan.png"));
            this.kunci = ImageIO.read(new File("src\\Image\\copper.png"));
            this.theEnd = ImageIO.read(new File("src\\Image\\win.jpg"));
            this.youLose = ImageIO.read(new File("src\\Image\\Joker_laughing.gif"));
            this.S = ImageIO.read(new File("src\\Image\\S.png"));
            this.I = ImageIO.read(new File("src\\Image\\I.png"));
            this.A = ImageIO.read(new File("src\\Image\\A.png"));
            this.C = ImageIO.read(new File("src\\Image\\C.png"));
            this.H = ImageIO.read(new File("src\\Image\\H.png"));
            this.P = ImageIO.read(new File("src\\Image\\0.png"));
            this.P = ImageIO.read(new File("src\\Image\\1.png"));
            this.P = ImageIO.read(new File("src\\Image\\2.png"));
            this.P = ImageIO.read(new File("src\\Image\\3.png"));
            this.P = ImageIO.read(new File("src\\Image\\4.png"));
            this.P = ImageIO.read(new File("src\\Image\\5.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
<<<<<<< HEAD

=======
    
    
    
>>>>>>> origin/master
    /**
     * Method untuk menampilkan component yang dibuat ke dalam suatu canvas
     */
    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2d = (Graphics2D) g;

        for (int i = 0; i < this.cc.pjgBoard(); i++) {
            for (int j = 0; j < this.cc.pjgBoard(); j++) {
                g2d.drawString("Sisa Chips : " + cc.getSisaChips(), 500, 10);
                if (cc.chipIsAlive() == false) {
                    g2d.drawImage(youLose, 0, 0, this);
                } else if (this.cc.chipIsWin() == true) {
                    g2d.drawImage(theEnd, 0, 0, this);
                } else if (this.cc.getTileInfo(j, i) == '-') {
                    g2d.drawImage(tileBiasa, i * 32, j * 32, this);
                } else if (cc.getTileInfo(j, i) == 'w') {
                    g2d.drawImage(air, i * 32, j * 32, this);
                } else if (cc.getTileInfo(j, i) == 'f') {
                    g2d.drawImage(api, i * 32, j * 32, this);
                } else if (cc.getTileInfo(j, i) == '#') {
                    g2d.drawImage(chip, i * 32, j * 32, this);
                } else if (cc.getTileInfo(j, i) == 'o' && cc.getArahKepala() == 2) {
                    g2d.drawImage(playerBawah, i * 32, j * 32, this);
                } else if (cc.getTileInfo(j, i) == 'o' && cc.getArahKepala() == 4) {
                    g2d.drawImage(playerKiri, i * 32, j * 32, this);
                } else if (cc.getTileInfo(j, i) == 'o' && cc.getArahKepala() == 6) {
                    g2d.drawImage(playerKanan, i * 32, j * 32, this);
                } else if (cc.getTileInfo(j, i) == 'o' && cc.getArahKepala() == 8) {
                    g2d.drawImage(playerAtas, i * 32, j * 32, this);
                } else if (cc.getTileInfo(j, i) == '1') {
                    g2d.drawImage(tembok, i * 32, j * 32, this);
                } else if (cc.getTileInfo(j, i) == '6') {
                    g2d.drawImage(portal, i * 32, j * 32, this);
                } else if (cc.getTileInfo(j, i) == '3') {
                    g2d.drawImage(sepatuAir, i * 32, j * 32, this);
                } else if (cc.getTileInfo(j, i) == '4') {
                    g2d.drawImage(sepatuApi, i * 32, j * 32, this);
                } else if (cc.getTileInfo(j, i) == '2') {
                    g2d.drawImage(pintu, i * 32, j * 32, this);
                } else if (cc.getTileInfo(j, i) == '5') {
                    g2d.drawImage(kunci, i * 32, j * 32, this);
                }
            }

        }

    }
}
