package ChipsChallenge.Engine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bimobbb
 */
public class Tile {
    protected int x,y;
    
    public Tile(){
        
    }
    
    public Tile(int xKoordinat,int yKoordinat){
        this.x=xKoordinat;
        this.y=yKoordinat;
        
    }
    public char getInfo(){
        return '-';
    }
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }   
   
    
}
