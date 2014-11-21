/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChipsChallenge.Control;

import ChipsChallenge.Engine.Board;
import ChipsChallenge.Engine.Tile;
import ChipsChallenge.grafficStorage.ChipImageDrawer;

/**
 *
 * @author KevinT
 */
public class ChipsController {

    ChipImageDrawer GUI;
    private Board b;

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

    public String getTileInfo(int x, int y) {
        return b.getTileInfo(x, y);
    }
    
    public Tile[][] kembalikanBoard()
    {
        return b.kembalikanTile();
    }
}
