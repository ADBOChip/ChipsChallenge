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
    private boolean life,sW,sF;  
    private int jumlahKunci;
    
    public Player(int xKoordinat,int yKoordinat){
        super(xKoordinat, yKoordinat);
        life = true;
        sW = false; // Cek memakai sepatu Air , false jika tidak 
        sF = false; // Cek memakai sepatu Api , false jika tidak
    }
    
    public void isDead(){
        this.life=false;
    }
    
    @Override
    public char getInfo(){
        return 'o';
    }
    
    public void setstatusShoeW(boolean shoesWater){
        this.sW=shoesWater;
    }
    
    public boolean getStatusShoeF(){
        return this.sF;
    }
    
    public boolean getStatusShoeW(){
        return this.sW;
    }
    
     public void setstatusShoeF(boolean shoesFire){
        this.sF=shoesFire;
    }
    
    public boolean getLife(){
        return this.life;
    }
    
    public void moveUp(){
        this.x--;
                
    }
    
    public void moveDown(){
        this.x++;
    }
    
    public void moveLeft(){
        this.y--;
    }
    
   public void moveRight(){
       this.y++;
   }
   
    public void addKunci(){
        this.jumlahKunci++;
    }
    
    public void pakaiKunci(){
        if(jumlahKunci>=1){
            this.jumlahKunci--;
        }
    }
    
    public boolean bisaBukaPintu(){
        boolean result=false;
        if(jumlahKunci>=1){
            return true;
        }
        return result;
    }
    
    public void endGame(){
        this.isDead();
    }
}
