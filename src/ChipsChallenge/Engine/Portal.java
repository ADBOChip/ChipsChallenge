package ChipsChallenge.Engine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bimobbb
 */
public class Portal extends Tile {

    public Portal(int xKoordinat, int yKoordinat) {
        super(xKoordinat, yKoordinat);
    }
 
    @Override
    public char getInfo(){
        return '6';
    }
}
