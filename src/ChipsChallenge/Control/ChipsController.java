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
    //final agar tidak dapat diubah dari kelas lain
    private final Board b;

    public ChipsController() {
        b = new Board();
    }

    public void moveChipUp() {
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
    }

    public boolean chipIsAlive() {
        return b.isAlive();
    }

    public int pjgBoard() {
        return b.panjangTile();
    }

    public char getTileInfo(int x, int y) {
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
    }
}
