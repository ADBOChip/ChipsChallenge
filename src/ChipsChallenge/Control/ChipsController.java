/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChipsChallenge.Control;

import ChipsChallenge.Engine.Board;
import ChipsChallenge.Engine.Tile;
import ChipsChallenge.grafficStorage.ChipImageDrawer;

/**
 * Merupakan Controller dalam MVC
 */
public class ChipsController {
    ChipImageDrawer GUI;
<<<<<<< HEAD
    //final agar tidak dapat diubah dari kelas lain
    private final Board b;
=======
    private Board b,c; 
>>>>>>> origin/master

    public ChipsController() {
        b = new Board();
        this.b.newGame();
        c=new Board();
    }

    public void moveChipUp() {
<<<<<<< HEAD
        b.playerMoveUp();
    }

    public void moveChipDown() {
        b.playerMoveDown();        
    }

    public void moveChipLeft() {
        b.playerMoveLeft();        
    }

    public void moveChipRight() {
        b.playerMoveRight();        
=======
        this.b.playerMoveUp();
        this.b.repaintMap();

    }

    public void moveChipDown() {
        this.b.playerMoveDown();
        this.b.repaintMap();
    }

    public void moveChipLeft() {
        this.b.playerMoveLeft();
        this.b.repaintMap();
    }

    public void moveChipRight() {
        this.b.playerMoveRight();
        this.b.repaintMap();
>>>>>>> origin/master
    }

    public boolean chipIsAlive() {
        return this.b.isAlive();
    }

    public int pjgBoard() {
        return this.b.panjangTile();
    }

    public char getTileInfo(int x, int y) {
<<<<<<< HEAD
        return b.getTileInfo(x, y);
    }
    
    /**
     * memanggil method kembalikanTile dari kelas Board
     * @return array of Tile yang menjadi world 
     */
    public Tile[][] kembalikanBoard()
    {
        b.printWorld();
        return b.kembalikanTile();
=======
        return this.b.getTileInfo(x, y);
>>>>>>> origin/master
    }
}
