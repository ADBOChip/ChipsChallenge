/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bimobbb
 */
public class Board {
    Tile[][]world;
    Player p;
    
    Board(){
        world = new Tile[15][15];
        p = new Player();
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world.length; j++) {
                world[i][j] = new Tile();               
            }
        }
        world[0][14] = new Portal();
        world[0][0] = new Kunci();
        world[6][0] = new Kunci();
        world[10][1] = new Kunci();
        world[13][14] = new Kunci();
        world[3][3] = new Pintu();
        world[13][4] = new Pintu();
        world[11][9] = new Pintu();
        world[5][14] = new Pintu();
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                world[i][j] = new Air();
            }
        }
        for (int i = 11; i < 15; i++) {
            for (int j = 0; j < 3; j++) {
                world[i][j] = new Air();
            }
        }
        for (int i = 5; i < 8; i++) {
            world[5][i] = new Air();            
        }
        for (int i = 5; i < 8; i++) {
            world[8][i] = new Air();            
        }
        for (int i = 10; i < 14; i++) {
            world[0][i] = new Air();            
        }
        for (int i = 12; i < 15; i++) {
            world[2][i] = new Air();            
        }
        for (int i = 11; i < 15; i++) {
            world[i][10] = new Air();            
        }
        for (int i = 11; i < 15; i++) {
            world[14][i] = new Air();            
        }
        world[10][0] = new Air();
        world[10][2] = new Air();
        world[13][3] = new Air();
        world[6][5] = new Air();
        for (int i = 0; i < 3; i++) {
            world[8][i] = new Api();
        }
        for (int i = 5; i < 8; i++) {
            world[4][i] = new Api();
        }
        for (int i = 5; i < 8; i++) {
            world[7][i] = new Api();
        }
        for (int i = 10; i < 15; i++) {
            world[4][i] = new Api();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 5; j < 8; j++) {
                world[i][j] = new Api();
            }
        }
        for (int i = 11; i < 14; i++) {
            for (int j = 5; j < 8; j++) {
                world[i][j] = new Api();
            }
        }
        for (int i = 6; i < 11; i++) {
            for (int j = 10; j < 15; j++) {
                world[i][j] = new Api();
            }
        }
        for (int i = 11; i < 13; i++) {
            for (int j = 11; j < 15; j++) {
                world[i][j] = new Api();
            }
        }
        world[13][11] = new Api();
        world[13][13] = new Api();
        for (int i = 0; i < 11; i++) {
            world[i][9] = new Tembok();
        }
        for (int i = 0; i < 4; i++) {
            world[4][i] = new Tembok();
        }
        for (int i = 0; i < 4; i++) {
            world[9][i] = new Tembok();
        }
        for (int i = 10; i < 14; i++) {
            world[5][i] = new Tembok();
        }
        world[0][3]= new Tembok();
        world[1][3]= new Tembok();
        world[2][3]= new Tembok();
        world[5][2]= new Tembok();
        world[6][2]= new Tembok();
        world[10][3]= new Tembok();
        world[11][3]= new Tembok();
        world[12][3]= new Tembok();
        world[12][9]= new Tembok();
        world[13][9]= new Tembok();
        world[14][9]= new Tembok();
        world[1][10]= new Tembok();
        world[2][10]= new Tembok();
        world[3][10]= new Tembok();
        world[14][3]= new Tembok();        
        world[11][4] = new SepatuAir();
        world[13][12] = new SepatuApi();
                
        world[p.getX()][p.getY()] = new Player();
    }
    
    public void printWorld(){
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world.length; j++) {
                System.out.print(world[i][j].getInfo()+" ");
            }
            System.out.println("");
        }
    }
    
    

}
