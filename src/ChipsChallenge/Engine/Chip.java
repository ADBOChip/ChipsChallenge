/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChipsChallenge.Engine;

public class Chip extends Tile{
    public Chip(){
        
    }

    public Chip(int xKoordinat, int yKoordinat) {
        super(xKoordinat, yKoordinat);
    }
    @Override
     public char getInfo(){
        return '#';
    }
    
}
