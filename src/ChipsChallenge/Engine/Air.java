package ChipsChallenge.Engine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class Air extends Tile {

    public Air(){
        
    }
    public Air(int xKoordinat, int yKoordinat) {
        super(xKoordinat, yKoordinat);
    }
  
    @Override
    public char getInfo(){
        return 'w';
    }
}
