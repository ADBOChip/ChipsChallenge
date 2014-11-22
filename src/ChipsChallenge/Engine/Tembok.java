package ChipsChallenge.Engine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class Tembok extends Tile{
    
    public Tembok(){
        
    }

    public Tembok(int xKoordinat, int yKoordinat) {
        super(xKoordinat, yKoordinat);
    }

    
      
    @Override
    public char getInfo(){
        return '1';
    }
}
