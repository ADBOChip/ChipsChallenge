/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bimobbb
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner("File.txt");    // TODO code application logic here
    
    int[][]world = new int[15][15];
    
    int i = 0;
    int j = 0;
    while(sc.hasNextInt()){
        if(i < world.length){
            if(j < world.length){
                world[i][j] = sc.nextInt();
                j++;
            }else{
                i++;
                j = 0;
            }
        }else{
            break;
        }        
    }
    
    Game play = new Game(world);
    String move = sc.next();
    
    while(play.start(move)){                
        move = sc.next();
    }    
    
    sc.close();
    }
}
