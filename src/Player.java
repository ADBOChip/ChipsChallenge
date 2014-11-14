/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bimobbb
 */
public class Player {
    boolean life;
    int x,y;
    int n;
    
    public Player(int n){
        life = true;
        this.n = n;
        x = this.n / 2;
        y = this.n / 2;
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
    
    public void setPosition(int x,int y){
        this.x = x;
        this.y = y;
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
