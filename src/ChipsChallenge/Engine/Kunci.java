package ChipsChallenge.Engine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bimobbb
 */
public class Kunci extends Tile {
    
    public Kunci(){
        
    }

    public Kunci(int xKoordinat, int yKoordinat) {
        super(xKoordinat, yKoordinat);
    }
 
    @Override
    public char getInfo(){
        return '5';
    }
}
