package ChipsChallenge.Engine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class Portal extends Tile {
    
    public Portal(){
        
    }

    public Portal(int xKoordinat, int yKoordinat) {
        super(xKoordinat, yKoordinat);
    }
 
    @Override
    public char getInfo(){
        return '6';
    }
}
