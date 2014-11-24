
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChipsChallenge.Control;

import ChipsChallenge.Engine.Board;
import ChipsChallenge.Engine.Tile;
import ChipsChallenge.grafficStorage.ChipImageDrawer;
import ChipsChallenge.Audio.AudioBackground;
import ChipsChallenge.Audio.AudioDead;
import ChipsChallenge.Audio.AudioFootstep;
import ChipsChallenge.Audio.AudioWin;

/**
 * Merupakan Controller dalam MVC
 */
public class ChipsController {

    private ChipImageDrawer GUI;
    private Board b, c;
    private AudioBackground aB;
    private AudioFootstep aF;
    private AudioDead aD;
    private AudioWin aW;
    private int arahKepala = 2;
    private boolean selesai;

    /**
     * Konstruktor
     */
    public ChipsController() {
        selesai=false;
        aD = new AudioDead();
        aB = new AudioBackground();
        aW = new AudioWin();
        aB.play();
        aF = new AudioFootstep();
        b = new Board();
        this.b.newGame();
        c = new Board();
    }

    public void Selesai() {
        this.selesai = true;
    }

    public boolean getSelesai() {
        return this.selesai;
    }

    /**
     * Menggerakan Chip keatas Memanggil method playerMoveUp dari kelas Board
     */
    public void moveChipUp() {
        this.b.playerMoveUp();
        this.arahKepala = 8;
        this.b.repaintMap();
        aF.play();
        if (this.b.isWin() == true) {
            aB.close();
            aW.play();
        } else if (this.b.isAlive() == false) {
            aB.close();
            aD.play();
        }
    }

    /**
     * Menggerakan Chip kekanan Memanggil method playerMoveRight dari kelas
     * Board
     */
    public void moveChipRight() {
        b.playerMoveRight();
        this.arahKepala = 6;
        this.b.repaintMap();
        aF.play();
        if (this.b.isWin() == true) {
            aB.close();
            aW.play();
        } else if (this.b.isAlive() == false) {
            aB.close();
            aD.play();
        }
    }

    /**
     * Menggerakan Chip kebawah Memanggil method playerMoveDown dari kelas Board
     */
    public void moveChipDown() {
        this.b.playerMoveDown();
        this.arahKepala = 2;
        this.b.repaintMap();
        aF.play();
        if (this.b.isWin() == true) {
            aB.close();
            aW.play();
        } else if (this.b.isAlive() == false) {
            aB.close();
            aD.play();
        }
    }

    /**
     * Menggerakan Chip kekiri Memanggil method playerMoveLeft dari kelas Board
     */
    public void moveChipLeft() {
        this.b.playerMoveLeft();
        this.arahKepala = 4;
        this.b.repaintMap();
        aF.play();
        if (this.b.isWin() == true) {
            aB.close();
            aW.play();
        } else if (this.b.isAlive() == false) {
            aB.close();
            aD.play();
        }
    }

    /**
     * Mengetahui status kehidupan Player. memanggil method isAlive dari Board
     *
     * @return true jika player masih hidup
     * @return false jika player mati
     */
    public boolean chipIsAlive() {
        return this.b.isAlive();
    }

    public boolean chipIsWin() {
        return this.b.isWin();
    }

    public int pjgBoard() {
        return this.b.panjangTile();
    }

    /**
     * Mengembalikan nilai info pada Tile tertentu
     *
     * @param x : koordinat x Tile
     * @param y : koordinat y Tile
     * @return info pada tile
     */
    public char getTileInfo(int x, int y) {
        return this.b.getTileInfo(x, y);
    }

    public int getArahKepala() {
        return this.arahKepala;

    }
}
