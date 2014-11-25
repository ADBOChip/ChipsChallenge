/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChipsChallenge.Engine;

/**
 *
 * @author RickyWahyudi
 */
public class Barrier extends Tile{
    public Barrier(){
        
    }
     public Barrier(int xKoordinat, int yKoordinat) {
        super(xKoordinat, yKoordinat);
    }

    @Override
    public char getInfo() {
        return 'b';
    }
}
