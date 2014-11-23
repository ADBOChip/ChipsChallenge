
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChipsChallenge.Control;

import ChipsChallenge.Engine.Board;
import ChipsChallenge.Engine.Tile;
import ChipsChallenge.grafficStorage.ChipImageDrawer;
import ChipsChallenge.Audio.AudioBackground;

/**
 * Merupakan Controller dalam MVC
 */
public class ChipsController {
    ChipImageDrawer GUI;
    private Board b,c;
    AudioBackground ad;
    /**
     * Konstruktor
     */
    public ChipsController() {
        ad=new AudioBackground();
        ad.play();
        b = new Board();
        this.b.newGame();
        c = new Board();
    }

    /**
     * Menggerakan Chip keatas
     * Memanggil method playerMoveUp dari kelas Board
     */
    public void moveChipUp() {
        this.b.playerMoveUp();
        this.b.repaintMap();
    }
    
    /**
     * Menggerakan Chip kekanan
     * Memanggil method playerMoveRight dari kelas Board
     */
    public void moveChipRight() {
        b.playerMoveRight();
        this.b.repaintMap();

    }
    
    /**
     * Menggerakan Chip kebawah
     * Memanggil method playerMoveDown dari kelas Board
     */
    public void moveChipDown() {
        this.b.playerMoveDown();
        this.b.repaintMap();
    }

    /**
     * Menggerakan Chip kekiri
     * Memanggil method playerMoveLeft dari kelas Board
     */
    public void moveChipLeft() {
        this.b.playerMoveLeft();
        this.b.repaintMap();
    }

    /**
     * Mengetahui status kehidupan Player. memanggil method isAlive dari Board
     * @return true jika player masih hidup
     * @return false jika player mati
     */
    public boolean chipIsAlive() {
        return this.b.isAlive();
    }

    public int pjgBoard() {
        return this.b.panjangTile();
    }
    
    /**
     * Mengembalikan nilai info pada Tile tertentu
     * @param x : koordinat x Tile
     * @param y : koordinat y Tile
     * @return info pada tile
     */
    public char getTileInfo(int x, int y) {
        return this.b.getTileInfo(x, y);
    }
    
}

