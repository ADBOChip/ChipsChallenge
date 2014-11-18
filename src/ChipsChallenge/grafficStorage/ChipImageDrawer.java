/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChipsChallenge.grafficStorage;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author KevinT
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

    public void loadImages() {
        try {
            this.tileBiasa = ImageIO.read(new File("Image\\tile.png"));
            this.air = ImageIO.read(new File("Image\\air.png"));
            this.api = ImageIO.read(new File("Image\\api.png"));
            this.chip = ImageIO.read(new File("Image\\Chips.png"));
            this.pintu = ImageIO.read(new File("Image\\Wepear_tree.png"));
            this.portal = ImageIO.read(new File("Image\\Portal.jpg"));
            this.sepatuAir = ImageIO.read(new File("Image\\Pokeball_biru.png"));
            this.sepatuApi = ImageIO.read(new File("Image\\Pokeball_merah.png"));
            this.tembok = ImageIO.read(new File("Image\\Wepear_tree.png"));
            this.playerBawah = ImageIO.read(new File("Image\\Trainer_Bawah.png"));
            this.playerAtas = ImageIO.read(new File("Image\\Trainer_Atas.png"));
            this.playerKiri = ImageIO.read(new File("Image\\Trainer_Kiri.png"));
            this.playerKanan = ImageIO.read(new File("Image\\Trainer_Kanan.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
