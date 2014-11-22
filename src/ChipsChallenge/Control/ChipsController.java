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
    private Board b,c;

    public ChipsController() {
        b = new Board();
        this.b.newGame();
        c=new Board();
    }

    public void moveChipUp() {
        this.b.playerMoveUp();
        this.b.repaintMap();
    }
    
    public void moveChipRight() {
        b.playerMoveRight();
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


    public boolean chipIsAlive() {
        return this.b.isAlive();
    }

    public int pjgBoard() {
        return this.b.panjangTile();
    }

    public char getTileInfo(int x, int y) {
        return this.b.getTileInfo(x, y);
    }
    
}
