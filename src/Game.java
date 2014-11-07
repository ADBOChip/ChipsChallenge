/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bimobbb
 */
public class Game {
    Player chips;
    int[][]world;
    int x,y;
    
    public Game(int[][]w){
        chips = new Player(w.length);
        world = w;
        world[chips.getX()][chips.getY()] = 7;
        x = chips.getX();
        y = chips.getY();
    }
    
    public void printWorld(){
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world.length; j++) {
                System.out.print(world[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public boolean start(String move){
        int x0 = x;
        int y0 = y;
        if(chips.getLife()){
            if(move == "w"){                
                world[x][y] = 1;
                chips.moveUp();
                x0 = chips.getX();
                y0 = chips.getY();
                world[x0][y0] = 7;
            }else if(move == "a"){
                world[x][y] = 1;                
                chips.moveLeft(); 
                x0 = chips.getX();
                y0 = chips.getY();
                world[x0][y0] = 7;
            }else if(move == "s"){
                world[x][y] = 1;
                chips.moveDown(); 
                x0 = chips.getX();
                y0 = chips.getY();
                world[x0][y0] = 7;
            }else if(move == "d"){
                world[x][y] = 1;
                chips.moveRight();
                x0 = chips.getX();
                y0 = chips.getY();
                world[x0][y0] = 7;
            }
        printWorld();    
        return true;
        }else{
            return false;
        }
    }
    
   

}
