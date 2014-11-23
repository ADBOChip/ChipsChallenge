package ChipsChallenge.Engine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class Player extends Tile {
    /**
     * life : mengecek Player hidup / mati
     * sW : status memakai sepatu Air
     * sF : status memakai sepatu Api
     */
    private boolean life, sW, sF;  
    private int jumlahKunci;
    
    public Player(int xKoordinat,int yKoordinat){
        super(xKoordinat, yKoordinat);
        life = true; // di set true di awal permainan
        this.jumlahKunci = 0;
        sW = false; // di set false di awal permainan 
        sF = false; // di set false di awal permainan
    }
    
    /**
     * Mengecek kehidupan Player
     * @return true 
     */
    public boolean isAlive()
    {
        return this.life = true;
    }
    
    /**
     * Mengeset status hidup player mati
     */
    public void isDead(){
        this.life = false;
    }
    
    @Override
    public char getInfo(){
        return 'o';
    }
    
    /**
     * jika bertemu sepatu api dan player belum memakai sepatu  
     * @param shoesFire = true
     */
    public void setstatusShoeF(boolean shoesFire){
        this.sF = shoesFire;
    }
    
    /**
     * jika bertemu sepatu air dan player belum memakai sepatu  
     * @param shoesWater = true
     */
    public void setstatusShoeW(boolean shoesWater){
        this.sW = shoesWater;
    }
    
    /**
     * Mengetahui status sepatu Api
     * @return true jika sedang memakai
     * @return false jika tidak memakai
     */
    public boolean getStatusShoeF(){
        return this.sF;
    }
    
    /**
     * Mengetahui status sepatu Air
     * @return true jika sedang memakai
     * @return false jika tidak memakai
     */
    public boolean getStatusShoeW(){
        return this.sW;
    }   
    
    /**
     * Mengetahui status Player (hidup / mati)
     * @return true jika masih hidup
     * @return false jika sudah mati
     */ 
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
    
    /**
     * Jika bertemu Kunci, maka akan membawa kunci
     * jumlahKunci+1
     */
    public void addKunci(){
        this.jumlahKunci++;
    }
    
    /**
     * Jika memiliki kunci dan bertemu pintu maka kunci dipakai
     * jumlahKunci - 1
     */
    public void pakaiKunci(){
        if(jumlahKunci >= 1){
            this.jumlahKunci--;
        }
    }
    
    /**
     * Method digunakan jika bertemu pintu
     * @return true jika memiliki kunci
     * @return false jika tidak memiliki kunci
     */
    public boolean bisaBukaPintu(){
        boolean result = false;
        if(jumlahKunci >= 1){
            result = true;
        }
        return result;
    }
    
    /**
     * Mengeset player bila game berakhir
     */
    public void endGame(){
        this.isDead();
    }
}
