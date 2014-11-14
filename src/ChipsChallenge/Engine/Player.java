package ChipsChallenge.Engine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bimobbb
 */

public class Player extends Tile {
    boolean life,sW,sF;    
    int n;  
    
    public Player(int xKoordinat,int yKoordinat){
        super(xKoordinat, yKoordinat);
        life = true;
        sW = false; // Cek memakai sepatu Air , false jika tidak 
        sF = false; // Cek memakai sepatu Api , false jika tidak
        n = 14-2;
        this.x=6;
        this.y=6;
    }
    
    public void isDead(){
        this.life=false;
    }
    
    @Override
    public char getInfo(){
        return 'o';
    }
    
    public void setstatusShoeW(boolean shoesWater){
        this.sW=true;
    }
    
     public void setstatusShoeF(boolean shoesFire){
        this.sF=true;
    }
    
    public boolean getLife(){
        return this.life;
    }
    
    
   
}
