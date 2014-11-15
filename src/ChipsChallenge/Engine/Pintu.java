package ChipsChallenge.Engine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bimobbb
 */
public class Pintu extends Tile {
    
    public Pintu(){
        
    }

    public Pintu(int xKoordinat, int yKoordinat) {
        super(xKoordinat, yKoordinat);
    }
 
    @Override
    public char getInfo(){
        return '2';
    }
}
