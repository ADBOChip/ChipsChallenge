/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChipsChallenge.grafficStorage;

import ChipsChallenge.Control.ChipsController;
import ChipsChallenge.Engine.Board;
import ChipsChallenge.Engine.Tile;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

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
    private Image kunci;
    private Tile[][] board;
    private ChipsController cc;

    public ChipImageDrawer() {
        setFocusable(true);
        this.cc = new ChipsController();
        this.board = cc.kembalikanBoard();
        loadImages();
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (cc.chipIsAlive()) {
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_UP:
                            cc.moveChipUp();
                            repaint();
                            break;
                        case KeyEvent.VK_DOWN:
                            cc.moveChipDown();
                            repaint();
                            break;
                        case KeyEvent.VK_LEFT:
                            cc.moveChipLeft();
                            repaint();
                            break;
                        case KeyEvent.VK_RIGHT:
                            cc.moveChipRight();
                            repaint();
                            break;

                    }
                    System.out.println(cc.chipIsAlive());
                }
            }
        }
        );
    }

    public void loadImages() {
        try {
            this.tileBiasa = ImageIO.read(new File("src\\Image\\tile.png"));
            this.air = ImageIO.read(new File("src\\Image\\air.png"));
            this.api = ImageIO.read(new File("src\\Image\\api.png"));
            this.chip = ImageIO.read(new File("src\\Image\\Chips.png"));
            this.pintu = ImageIO.read(new File("src\\Image\\Wepear_tree.png"));
            this.portal = ImageIO.read(new File("src\\Image\\Portal.jpg"));
            this.sepatuAir = ImageIO.read(new File("src\\Image\\Pokeball_biru.png"));
            this.sepatuApi = ImageIO.read(new File("src\\Image\\Pokeball_merah.png"));
            this.tembok = ImageIO.read(new File("src\\Image\\Wepear_tree.png"));
            this.playerBawah = ImageIO.read(new File("src\\Image\\Trainer_Bawah.png"));
            this.kunci = ImageIO.read(new File("src\\Image\\Pokeball_biru.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        this.board = cc.kembalikanBoard();
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.

        System.out.println("");
        Graphics2D g2d = (Graphics2D) g;
        for (int i = 0; i < cc.pjgBoard(); i++) {
            for (int j = 0; j < cc.pjgBoard(); j++) {
                if (cc.getTileInfo(j, i) == '-') {
                    g2d.drawImage(tileBiasa, i * 32, j * 32, this);

                } else if (cc.getTileInfo(j, i) == 'w') {
                    g2d.drawImage(air, i * 32, j * 32, this);
                } else if (cc.getTileInfo(j, i) == 'f') {
                    g2d.drawImage(api, i * 32, j * 32, this);
                } else if (cc.getTileInfo(j, i) == '#') {
                    g2d.drawImage(chip, i * 32, j * 32, this);
                } else if (cc.getTileInfo(j, i) == 'o') {
                    g2d.drawImage(playerBawah, i * 32, j * 32, this);
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

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ash Challenge");
        frame.setBackground(Color.GREEN);
        frame.pack();
        frame.add(new ChipImageDrawer());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(new Dimension(600, 600));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
