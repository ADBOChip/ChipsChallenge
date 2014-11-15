package ChipsChallenge.Engine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bimobbb
 */
public class Board {
    private Tile[][]world;
    private Player p;
    private int pGetX,pGetY;
    private Tembok wall;
    private Pintu door;
    private Api fire;
    private Air water;
    private SepatuAir sAir;
    private SepatuApi sApi;
    private Portal port;
    
    Board(){
        wall=new Tembok();
        fire=new Api();
        water=new Air();
        door=new Pintu();
        port=new Portal();
        sApi=new SepatuApi();
        sAir=new SepatuAir();
        world = new Tile[15][15];
        p = new Player(6,6);
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world.length; j++) {
                world[i][j] = new Tile(i,j);               
            }
        }
        world[0][14] = new Portal(0,14);
        world[0][0] = new Kunci(0,0);
        world[6][0] = new Kunci(6,0);
        world[10][1] = new Kunci(10,1);
        world[13][14] = new Kunci(13,14);
        world[3][3] = new Pintu(3,3);
        world[13][4] = new Pintu(13,4);
        world[11][9] = new Pintu(11,9);
        world[5][14] = new Pintu(5,14);
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                world[i][j] = new Air(i,j);
            }
        }
        for (int i = 11; i < 15; i++) {
            for (int j = 0; j < 3; j++) {
                world[i][j] = new Air(i,j);
            }
        }
        for (int i = 5; i < 8; i++) {
            world[5][i] = new Air(5,i);            
        }
        for (int i = 5; i < 8; i++) {
            world[8][i] = new Air(8,i);            
        }
        for (int i = 10; i < 14; i++) {
            world[0][i] = new Air(0,i);            
        }
        for (int i = 12; i < 15; i++) {
            world[2][i] = new Air(2,i);            
        }
        for (int i = 11; i < 15; i++) {
            world[i][10] = new Air(i,10);            
        }
        for (int i = 11; i < 15; i++) {
            world[14][i] = new Air(14,i);            
        }
        world[10][0] = new Air(10,0);
        world[10][2] = new Air(10,2);
        world[13][3] = new Air(13,3);
        world[6][5] = new Air(6,5);
        for (int i = 0; i < 3; i++) {
            world[8][i] = new Api(8,i);
        }
        for (int i = 5; i < 8; i++) {
            world[4][i] = new Api(4,i);
        }
        for (int i = 5; i < 8; i++) {
            world[7][i] = new Api(7,i);
        }
        for (int i = 10; i < 15; i++) {
            world[4][i] = new Api(4,i);
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 5; j < 8; j++) {
                world[i][j] = new Api(i,j);
            }
        }
        for (int i = 11; i < 14; i++) {
            for (int j = 5; j < 8; j++) {
                world[i][j] = new Api(i,j);
            }
        }
        for (int i = 6; i < 11; i++) {
            for (int j = 10; j < 15; j++) {
                world[i][j] = new Api(i,j);
            }
        }
        for (int i = 11; i < 13; i++) {
            for (int j = 11; j < 15; j++) {
                world[i][j] = new Api(i,j);
            }
        }
        world[13][11] = new Api(13,11);
        world[13][13] = new Api(13,13);
        for (int i = 0; i < 11; i++) {
            world[i][9] = new Tembok(i,9);
        }
        for (int i = 0; i < 4; i++) {
            world[4][i] = new Tembok(4,i);
        }
        for (int i = 0; i < 4; i++) {
            world[9][i] = new Tembok(9,i);
        }
        for (int i = 10; i < 14; i++) {
            world[5][i] = new Tembok(5,i);
        }
        world[0][3]= new Tembok(0,3);
        world[1][3]= new Tembok(1,3);
        world[2][3]= new Tembok(2,3);
        world[5][2]= new Tembok(5,2);
        world[6][2]= new Tembok(6,2);
        world[10][3]= new Tembok(10,3);
        world[11][3]= new Tembok(11,3);
        world[12][3]= new Tembok(12,3);
        world[12][9]= new Tembok(12,9);
        world[13][9]= new Tembok(13,9);
        world[14][9]= new Tembok(14,9);
        world[1][10]= new Tembok(1,10);
        world[2][10]= new Tembok(2,10);
        world[3][10]= new Tembok(3,10);
        world[14][3]= new Tembok(14,3);        
        world[11][4] = new SepatuAir(11,4);
        world[13][12] = new SepatuApi(13,12);
        this.pGetX=6;
        this.pGetY=6;
        world[pGetX][pGetY] = new Player(pGetX,pGetY);
    }
    
    public void printWorld(){
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world.length; j++) {
                world[this.pGetX][this.pGetY]=new Tile(this.pGetX,this.pGetY);
                if((i==this.p.getX())&&(j==this.p.getY())){
                    System.out.print("o"+" ");
                    this.pGetX=p.getX();
                    this.pGetY=p.getY();
                }
                else{
                    System.out.print(world[i][j].getInfo()+" ");
                }
            }
            System.out.println("");
        }
    }
    
    public void playerMoveUp(){
        if(world[pGetX-1][pGetY].getInfo()==wall.getInfo()){
            
        }
        else if(world[pGetX-1][pGetY].getInfo()==fire.getInfo()){
            if(this.p.getStatusShoeF()==true){
                this.p.x--;
            }
            else{
                this.p.isDead();
            }
        }
        else if(world[pGetX-1][pGetY].getInfo()==water.getInfo()){
            if(this.p.getStatusShoeF()==true){
                this.p.x--;
            }
            else{
                this.p.isDead();
            }
        }
        else if(world[pGetX-1][pGetY].getInfo()==sAir.getInfo()){
            this.p.setstatusShoeW(true);
            this.p.x--;
            
        }
        else if(world[pGetX-1][pGetY].getInfo()==sApi.getInfo()){
            this.p.setstatusShoeF(true);
            this.p.x--;
            
        }
        else{
            this.p.x--;
        }
        
        
    }
    
    public void playerMoveDown(){
        if(world[pGetX+1][pGetY].getInfo()==wall.getInfo()){
            
        }
        else if(world[pGetX+1][pGetY].getInfo()==fire.getInfo()){
            if(this.p.getStatusShoeF()==true){
                this.p.x++;
            }
            else{
                this.p.isDead();
            }   
        }
        else if(world[pGetX+1][pGetY].getInfo()==water.getInfo()){
            if(this.p.getStatusShoeW()==true){
                this.p.x++;
            }
            else{
                this.p.isDead();
            }   
        }
        else if(world[pGetX+1][pGetY].getInfo()==sAir.getInfo()){
            this.p.setstatusShoeW(true);
            this.p.x++;
            
        }
        else if(world[pGetX+1][pGetY].getInfo()==sApi.getInfo()){
            this.p.setstatusShoeF(true);
            this.p.x++;
            
        }
        else{
            this.p.x++;
        }
        
    }
    
    public void playerMoveLeft(){
        this.pGetX=p.getX();
        this.pGetY=p.getY();
        if(world[pGetX][pGetY-1].getInfo()==wall.getInfo()){
            
        }
        else if(world[pGetX][pGetY-1].getInfo()==fire.getInfo()){
            if(this.p.getStatusShoeF()==true){
                this.p.y--;
            }
            else{
                this.p.isDead();
            }   
        }
        else if(world[pGetX][pGetY-1].getInfo()==water.getInfo()){
            if(this.p.getStatusShoeW()==true){
                this.p.y--;
            }
            else{
                this.p.isDead();
            }  
        }
        else if(world[pGetX][pGetY-1].getInfo()==sAir.getInfo()){
            this.p.setstatusShoeW(true);
            world[pGetX][pGetY-1]=new Tile(pGetX+1,pGetY);
        }
        else if(world[pGetX][pGetY-1].getInfo()==sApi.getInfo()){
            this.p.setstatusShoeF(true);
            world[pGetX][pGetY-1]=new Tile(pGetX+1,pGetY);
        }
        else if(world[pGetX][pGetY-1].getInfo()==sAir.getInfo()){
            this.p.setstatusShoeW(true);
            world[pGetX][pGetY-1]=new Tile(pGetX+1,pGetY);
        }
        else if(world[pGetX][pGetY-1].getInfo()==sApi.getInfo()){
            this.p.setstatusShoeF(true);
            world[pGetX][pGetY-1]=new Tile(pGetX+1,pGetY);
        }
        else{
            this.p.y--;
        }
        
    }
    
    public void playerMoveRight(){
        this.pGetX=p.getX();
        this.pGetY=p.getY();
        if(world[pGetX][pGetY+1].getInfo()==wall.getInfo()){
            
        }
        else if(world[pGetX][pGetY+1].getInfo()==fire.getInfo()){
            if(this.p.getStatusShoeF()==true){
                this.p.y++;
            }
            else{
                this.p.isDead();
            }  
        }
        else if(world[pGetX][pGetY+1].getInfo()==water.getInfo()){
            if(this.p.getStatusShoeW()==true){
                this.p.y++;
            }
            else{
                this.p.isDead();
            }  
        }
        else if(world[pGetX][pGetY+1].getInfo()==sAir.getInfo()){
            this.p.setstatusShoeW(true);
            world[pGetX][pGetY+1]=new Tile(pGetX+1,pGetY);
        }
        else if(world[pGetX][pGetY+1].getInfo()==sApi.getInfo()){
            this.p.setstatusShoeF(true);
            world[pGetX][pGetY+1]=new Tile(pGetX+1,pGetY);
        }
        else{
            this.p.y++;
        }
        
    }   
    
    public boolean isAlive(){
        return this.p.getLife();
    }

}
