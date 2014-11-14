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
        while(b.p.getLife()==true){
            int movement=sc.nextInt();
            if(movement==2){
                b.p.moveDown();
            }
            else if(movement==4){
                b.p.moveLeft();
            }
            else if(movement==6){
                b.p.moveRight();
            }
            else if(movement==8){
                b.p.moveUp();
            }
            b.printWorld();
        }
    }
}
