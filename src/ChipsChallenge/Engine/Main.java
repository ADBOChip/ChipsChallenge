package ChipsChallenge.Engine;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bimobbb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board b = new Board();
        b.printWorld();
        Scanner sc=new Scanner(System.in);
        while(b.isAlive()==true){
            int movement=sc.nextInt();
            if(movement==2){
                b.playerMoveDown();
            }
            else if(movement==4){
                b.playerMoveLeft();
            }
            else if(movement==6){
                b.playerMoveRight();
            }
            else if(movement==8){
                b.playerMoveUp();
            }
            b.printWorld();
        }
    }
}
