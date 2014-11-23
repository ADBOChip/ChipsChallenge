package ChipsChallenge.Engine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Merupakan Model dalam MVC
 * Component yang berada di dalam world chips
 * Merupakan Superclass 
 */
public class Tile {
    //atribute untuk mengetahui posisi Tile
    protected int x,y;
    
    public Tile(){
        
    }
    
    /**
     * Konstruktor dari kelas
     * @param xKoordinat : Koordinat x dari tile 
     * @param yKoordinat : Koordinat y dari tile
     */
    public Tile(int xKoordinat,int yKoordinat){
        this.x=xKoordinat;
        this.y=yKoordinat;        
    }
    
    /**
     * Mengetahui info dari tile
     * @return info bertipe char untuk world 
     */
    public char getInfo(){
        return '-';
    }
    
    /**
     * Mengembalikan nilai koordinat x pada Tile
     * @return int x
     */
    public int getX(){
        return this.x;
    }
    
    /**
     * Mengembalikan nilai koordinat y pada Tile
     * @return int y
     */
    public int getY(){
        return this.y;
    }   
   
    
}
