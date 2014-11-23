package ChipsChallenge.Engine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class Api extends Tile {
    
    public Api(){
        
    }

    public Api(int xKoordinat, int yKoordinat) {
        super(xKoordinat, yKoordinat);
    }

    @Override
    public char getInfo() {
        return 'f';
    }
}
