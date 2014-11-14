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
    int x,y;
    int n;  
    
    public Player(){
        life = true;
        sW = false; // Cek memakai sepatu Air , false jika tidak 
        sF = false; // Cek memakai sepatu Api , false jika tidak
        this.n = 14-2;
        x = this.n / 2;
        y = this.n / 2;
    }
    
    public void isDead(){
        this.life=false;
    }
    
   
    
    public char getInfo(){
        return 'o';
    }
    
    public void setstatusShoeW(){
        if(this.sW){
            this.sW = false;
        }else{
            this.sW = true;
        }
    }
    
    public void setstatusShoeF(){
        if(this.sF){
            this.sF = false;
        }else{
            this.sF = true;
        }
    }
    
    public boolean getLife(){
        return this.life;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }   
    
    public void moveUp(){
        if(this.getX() == 0){
            this.x = x;
        }else{
            this.x--;
        }
    }
    
    public void moveDown(){
        if(this.getX() >= this.n){
            this.x = x;
        }else{
            this.x++;
        }
    }
    
    public void moveLeft(){
        if(this.getY() == 0){
            this.y = y;
        }else{
            this.y--;
        }
    }
    
    public void moveRight(){
        if(this.getY() >= this.n){
            this.y = y;
        }else{
            this.y++;
        }
    }   
   
}
